package musicPlayer.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import musicPlayer.bbdd.gestor.GestorUsers;
import musicPlayer.bbdd.pojo.AccountPojo;
import musicPlayer.controller.exceptions.LoginPassException;

public class UserController {

	private GestorUsers gestorUsers = null;
	private static final int MAX_INTENTOS_FALLIDOS = 3;

	public UserController () {
		gestorUsers = new GestorUsers();
	}
	
	public boolean usuarioBloqueado(String user, String password) throws SQLException, Exception {
		return gestorUsers.usuarioBloqueado(user);
	}

	public boolean verificarCredenciales(String user, String password) {
		boolean ret = false;

		ArrayList<AccountPojo> accountPojos = gestorUsers.obtenerDatosLogin();
		if (accountPojos != null) {
			for (AccountPojo accountPojo : accountPojos) {
				if (accountPojo.getUser().equalsIgnoreCase(user) && accountPojo.getPassword().equals(password)) {
					ret = true;
					break;
				}
			}
		}
		return ret;
	}

	public void verificarCredenciales2(String user, String password) throws LoginPassException {
		boolean encontrado = false;
		ArrayList<AccountPojo> accountPojos = gestorUsers.obtenerDatosLogin();
		if (accountPojos != null) {
			for (AccountPojo accountPojo : accountPojos) {
				if (accountPojo.getUser().equalsIgnoreCase(user) && accountPojo.getPassword().equals(password)) {
					encontrado = true;
					break;
				}
			}
			
			if (!encontrado) {
				throw new LoginPassException();
			}
		} else {
			throw new LoginPassException();
		}
		
	}
	
	public boolean bloquearUsuario(String user, int intentos) {
		if (intentos >= MAX_INTENTOS_FALLIDOS) {
			gestorUsers.bloquearUsuario(user);
			return true;
		}
		return false;
	}

	public void modificarFecha(String user) {

		GestorUsers gestorUsers = new GestorUsers();
		gestorUsers.updateLastLogin(user);

	}

	/*
	 * public boolean verificarCredenciales(String user, String password) {
	 * ArrayList<AccountPojo> accountPojos = gestorUsers.obtenerDatosLogin(); if
	 * (accountPojos != null) { for (AccountPojo accountPojo : accountPojos) { if
	 * (accountPojo.getUser().equalsIgnoreCase(user) &&
	 * accountPojo.getPassword().equals(password)) {
	 * gestorUsers.reiniciarIntentosFallidos(user); return true; } } }
	 * gestorUsers.incrementarIntentosFallidos(user); return false; }
	 * 
	 * public void incrementarIntentosFallidos(String user) { int intentos =
	 * gestorUsers.obtenerIntentosFallidos(user); intentos++; if (intentos >=
	 * MAX_INTENTOS_FALLIDOS) { gestorUsers.bloquearUsuario(user); } else {
	 * gestorUsers.actualizarIntentosFallidos(user, intentos); } }
	 * 
	 */

}
