package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class UserPojo implements Serializable {

	private static final long serialVersionUID = 5479860183418683518L;

	private String nombre = null;
	private String apellido1 = null;
	private String apellido2 = null;
	private String dni = null;
	private Date fechaNacimiento = null;
	private String direccion = null;
	private int codigoPosal = 0;
	private String ciudad = null;
	private String provincica = null;

	private AccountPojo Account = null;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPosal() {
		return codigoPosal;
	}

	public void setCodigoPosal(int codigoPosal) {
		this.codigoPosal = codigoPosal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincica() {
		return provincica;
	}

	public void setProvincica(String provincica) {
		this.provincica = provincica;
	}

	public AccountPojo getAccount() {
		return Account;
	}

	public void setAccount(AccountPojo account) {
		Account = account;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserPojo [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", codigoPosal=" + codigoPosal
				+ ", ciudad=" + ciudad + ", provincica=" + provincica + ", Account=" + Account + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Account, apellido1, apellido2, ciudad, codigoPosal, direccion, dni, fechaNacimiento, nombre,
				provincica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPojo other = (UserPojo) obj;
		return Objects.equals(Account, other.Account) && Objects.equals(apellido1, other.apellido1)
				&& Objects.equals(apellido2, other.apellido2) && Objects.equals(ciudad, other.ciudad)
				&& codigoPosal == other.codigoPosal && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(provincica, other.provincica);
	}

}
