package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Objects;

public abstract class OwnerPojo implements Serializable {

	private static final long serialVersionUID = 3572750290051824261L;

	private int id = 0;
	private String imagen = null;
	private String name = null;
	private String description = null;
	private int reproductionNumber = 0;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, imagen, name, reproductionNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OwnerPojo other = (OwnerPojo) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(imagen, other.imagen)
				&& Objects.equals(name, other.name) && reproductionNumber == other.reproductionNumber;
	}

	@Override
	public String toString() {
		return "OwnerPojo [id=" + id + ", imagen=" + imagen + ", name=" + name + ", description=" + description
				+ ", reproductionNumber=" + reproductionNumber + "]";
	}

}
