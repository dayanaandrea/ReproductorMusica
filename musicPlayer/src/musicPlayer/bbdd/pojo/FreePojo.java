package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class FreePojo extends AccountPojo implements Serializable {

	private static final long serialVersionUID = 1254752404583060983L;
	private Date lastReproduction = null;

	@Override
	public String toString() {
		return "FreePojo [lastReproduction=" + lastReproduction + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lastReproduction);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FreePojo other = (FreePojo) obj;
		return Objects.equals(lastReproduction, other.lastReproduction);
	}

	public Date getLastReproduction() {
		return lastReproduction;
	}

	public void setLastReproduction(Date lastReproduction) {
		this.lastReproduction = lastReproduction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
