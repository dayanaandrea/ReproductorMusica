package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class GroupPojo implements Serializable {

	private static final long serialVersionUID = 8990090451257984730L;

	private int id = 0;
	private String imagen = null;
	private String name = null;
	private String description = null;
	private int reproductionNumber = 0;
	private Date formationDate = null;

	private List<DiskPojo> Disks = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReproductionNumber() {
		return reproductionNumber;
	}

	public void setReproductionNumber(int reproductionNumber) {
		this.reproductionNumber = reproductionNumber;
	}

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
		return Objects.hash(Disks, description, formationDate, id, imagen, name, reproductionNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupPojo other = (GroupPojo) obj;
		return Objects.equals(Disks, other.Disks) && Objects.equals(description, other.description)
				&& Objects.equals(formationDate, other.formationDate) && id == other.id
				&& Objects.equals(imagen, other.imagen) && Objects.equals(name, other.name)
				&& reproductionNumber == other.reproductionNumber;
	}

	@Override
	public String toString() {
		return "GroupPojo [id=" + id + ", imagen=" + imagen + ", name=" + name + ", description=" + description
				+ ", reproductionNumber=" + reproductionNumber + ", formationDate=" + formationDate + ", Disks=" + Disks
				+ "]";
	}



}