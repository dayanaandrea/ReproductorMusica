package musicPlayer.controller;

import java.util.ArrayList;

import musicPlayer.bbdd.gestor.GestorUsers;
import musicPlayer.bbdd.pojo.AccountPojo;

public class UserController {

	GestorUsers gestorUsers= new GestorUsers();
	private static final int MAX_INTENTOS_FALLIDOS = 3;

	public boolean usuarioBloqueado(String user, String password) {
		boolean bloqueado =gestorUsers.usuarioBloqueado(user);
		
		
		if (bloqueado != true ) {
			verificarCredenciales(user, password);
		}else {
			return bloqueado = true;
		}
		return bloqueado;

	}

	public boolean verificarCredenciales(String user, String password) {

		boolean credencialesValidas = false; ;

		ArrayList<AccountPojo> accountPojos = gestorUsers.obtenerDatosLogin();
		if (accountPojos  != null) {
			for (AccountPojo accountPojo : accountPojos ) {
				if (accountPojo.getUser().equalsIgnoreCase(user) && accountPojo.getPassword().equals(password)) {
					return true; 
				}
			}
		}
		return credencialesValidas;
	}



	public boolean bloqueoLogin(String user, String password, int intentos) {

		if (intentos >= MAX_INTENTOS_FALLIDOS) {
			System.out.println(intentos);
			gestorUsers.bloquearUsuario(user);
		}

		return false;


	}
	
	public void modificarFecha(String user) {

		GestorUsers gestorUsers = new GestorUsers();
		gestorUsers.updateLastLogin(user);
		
	}
	
	/*public boolean verificarCredenciales(String user, String password) {
	    ArrayList<AccountPojo> accountPojos = gestorUsers.obtenerDatosLogin();
	    if (accountPojos != null) {
	        for (AccountPojo accountPojo : accountPojos) {
	            if (accountPojo.getUser().equalsIgnoreCase(user) && accountPojo.getPassword().equals(password)) {
	                gestorUsers.reiniciarIntentosFallidos(user); 
	                return true;
	            }
	        }
	    }
	    gestorUsers.incrementarIntentosFallidos(user); 
	    return false;
	}

	public void incrementarIntentosFallidos(String user) {
	    int intentos = gestorUsers.obtenerIntentosFallidos(user);
	    intentos++;
	    if (intentos >= MAX_INTENTOS_FALLIDOS) {
	        gestorUsers.bloquearUsuario(user);
	    } else {
	        gestorUsers.actualizarIntentosFallidos(user, intentos);
	    }
	}

*/

}	

