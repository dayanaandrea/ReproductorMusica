package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public abstract class AccountPojo implements Serializable {

	private static final long serialVersionUID = 7298104131572013622L;
	private String user = null;
	private String password = null;
	private Date registerDate = null;
	private boolean locked = false;
	private boolean manager = false;

	private UserPojo username = null;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public UserPojo getUsername() {
		return username;
	}

	public void setUsername(UserPojo username) {
		this.username = username;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(locked, manager, password, registerDate, user, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountPojo other = (AccountPojo) obj;
		return locked == other.locked && manager == other.manager && Objects.equals(password, other.password)
				&& Objects.equals(registerDate, other.registerDate) && Objects.equals(user, other.user)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "AccountPojo [user=" + user + ", password=" + password + ", registerDate=" + registerDate + ", locked="
				+ locked + ", manager=" + manager + ", username=" + username + "]";
	}

}
