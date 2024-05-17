package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PodcasterPojo  implements Serializable {

	private static final long serialVersionUID = 3556671960562717013L;

	private int id = 0;
	private String imagen = null;
	private String name = null;
	private String description = null;
	private int reproductionNumber = 0;
	private Date unionDate = null;

	private List<SeriePojo> Series = null;

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

	public Date getUnionDate() {
		return unionDate;
	}

	public void setUnionDate(Date unionDate) {
		this.unionDate = unionDate;
	}

	public List<SeriePojo> getSeries() {
		return Series;
	}

	public void setSeries(List<SeriePojo> series) {
		Series = series;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Series, description, id, imagen, name, reproductionNumber, unionDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PodcasterPojo other = (PodcasterPojo) obj;
		return Objects.equals(Series, other.Series) && Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(imagen, other.imagen) && Objects.equals(name, other.name)
				&& reproductionNumber == other.reproductionNumber && Objects.equals(unionDate, other.unionDate);
	}

	@Override
	public String toString() {
		return "PodcasterPojo [id=" + id + ", imagen=" + imagen + ", name=" + name + ", description=" + description
				+ ", reproductionNumber=" + reproductionNumber + ", unionDate=" + unionDate + ", Series=" + Series
				+ "]";
	}

	
	
}