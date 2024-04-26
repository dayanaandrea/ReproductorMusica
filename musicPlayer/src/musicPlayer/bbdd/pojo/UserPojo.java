package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class UserPojo implements Serializable {

	private static final long serialVersionUID = 5479860183418683518L;

	private String theName = null;
	private String surname1 = null;
	private String surname2 = null;
	private String dni = null;
	private Date birthDate = null;
	private String address = null;
	private int postalCode = 0;
	private String city = null;
	private String province = null;

	private AccountPojo account = null;
	private List<ReproductionListPojo> ReproductionLists = null;

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
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
		return Objects.hash(ReproductionLists, account, address, birthDate, city, dni, postalCode, province, surname1,
				surname2, theName);
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
				&& Objects.equals(city, other.city) && Objects.equals(dni, other.dni) && postalCode == other.postalCode
				&& Objects.equals(province, other.province) && Objects.equals(surname1, other.surname1)
				&& Objects.equals(surname2, other.surname2) && Objects.equals(theName, other.theName);
	}

	@Override
	public String toString() {
		return "UserPojo [theName=" + theName + ", surname1=" + surname1 + ", surname2=" + surname2 + ", dni=" + dni
				+ ", birthDate=" + birthDate + ", address=" + address + ", postalCode=" + postalCode + ", city=" + city
				+ ", province=" + province + ", account=" + account + ", ReproductionLists=" + ReproductionLists + "]";
	}

}
