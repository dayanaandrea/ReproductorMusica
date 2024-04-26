package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class UserPojo implements Serializable {

	private static final long serialVersionUID = 5479860183418683518L;

	private String name = null;
	private String surmane1 = null;
	private String surname2 = null;
	private String dni = null;
	private Date birthDate = null;
	private String address = null;
	private int postalCode = 0;
	private String city = null;
	private String province = null;

	private AccountPojo account = null;
	private List<ReproductionListPojo> ReproductionLists = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurmane1() {
		return surmane1;
	}

	public void setSurmane1(String surmane1) {
		this.surmane1 = surmane1;
	}

	public String getSurname2() {
		return surname2;
	}

	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public AccountPojo getAccount() {
		return account;
	}

	public void setAccount(AccountPojo account) {
		this.account = account;
	}

	public List<ReproductionListPojo> getReproductionLists() {
		return ReproductionLists;
	}

	public void setReproductionLists(List<ReproductionListPojo> reproductionLists) {
		ReproductionLists = reproductionLists;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ReproductionLists, account, address, birthDate, city, dni, name, postalCode, province,
				surmane1, surname2);
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
		return Objects.equals(ReproductionLists, other.ReproductionLists) && Objects.equals(account, other.account)
				&& Objects.equals(address, other.address) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(city, other.city) && Objects.equals(dni, other.dni)
				&& Objects.equals(name, other.name) && postalCode == other.postalCode
				&& Objects.equals(province, other.province) && Objects.equals(surmane1, other.surmane1)
				&& Objects.equals(surname2, other.surname2);
	}

	@Override
	public String toString() {
		return "UserPojo [name=" + name + ", surmane1=" + surmane1 + ", surname2=" + surname2 + ", dni=" + dni
				+ ", birthDate=" + birthDate + ", address=" + address + ", postalCode=" + postalCode + ", city=" + city
				+ ", province=" + province + ", account=" + account + ", ReproductionLists=" + ReproductionLists + "]";
	}

}
