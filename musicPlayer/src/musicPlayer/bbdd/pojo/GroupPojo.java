package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class GroupPojo extends OwnerPojo implements Serializable {

	private static final long serialVersionUID = 8990090451257984730L;

	private Date formationDate = null;

	private List<DiskPojo> Disks = null;

	public Date getFormationDate() {
		return formationDate;
	}

	public void setFormationDate(Date formationDate) {
		this.formationDate = formationDate;
	}

	public List<DiskPojo> getDisks() {
		return Disks;
	}

	public void setDisks(List<DiskPojo> disks) {
		Disks = disks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Disks, formationDate);
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
		GroupPojo other = (GroupPojo) obj;
		return Objects.equals(Disks, other.Disks) && Objects.equals(formationDate, other.formationDate);
	}

	@Override
	public String toString() {
		return "GroupPojo [formationDate=" + formationDate + ", Disks=" + Disks + "]";
	}

}
