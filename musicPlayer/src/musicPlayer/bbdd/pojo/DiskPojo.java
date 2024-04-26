package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DiskPojo implements Serializable {

	private static final long serialVersionUID = 5315631289498341134L;

	private int idDisk = 0;
	private String title = null;
	private String image = null;
	private Date publicationDate = null;
	private String gender = null;
	private String description = null;
	private int reproductionNumber = 0;

	private List<SongPojo> Songs = null;
	private GroupPojo group = null;

	public int getIdDisk() {
		return idDisk;
	}

	public void setIdDisk(int idDisk) {
		this.idDisk = idDisk;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public List<SongPojo> getSongs() {
		return Songs;
	}

	public void setSongs(List<SongPojo> songs) {
		Songs = songs;
	}

	public GroupPojo getGroup() {
		return group;
	}

	public void setGroup(GroupPojo group) {
		this.group = group;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Songs, description, gender, group, idDisk, image, publicationDate, reproductionNumber,
				title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiskPojo other = (DiskPojo) obj;
		return Objects.equals(Songs, other.Songs) && Objects.equals(description, other.description)
				&& Objects.equals(gender, other.gender) && Objects.equals(group, other.group) && idDisk == other.idDisk
				&& Objects.equals(image, other.image) && Objects.equals(publicationDate, other.publicationDate)
				&& reproductionNumber == other.reproductionNumber && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "DiskPojo [idDisk=" + idDisk + ", title=" + title + ", image=" + image + ", publicationDate="
				+ publicationDate + ", gender=" + gender + ", description=" + description + ", reproductionNumber="
				+ reproductionNumber + ", Songs=" + Songs + ", group=" + group + "]";
	}

}
