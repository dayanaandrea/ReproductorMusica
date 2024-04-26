package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public abstract class AudioPojo implements Serializable {

	private static final long serialVersionUID = 3728922367979290094L;

	private int id = 0;
	private String title = null;
	private int duration = 0;
	private int reproductionNumber = 0;

	private List<ReproductionListPojo> ReproductionLists = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getReproductionNumber() {
		return reproductionNumber;
	}

	public void setReproductionNumber(int reproductionNumber) {
		this.reproductionNumber = reproductionNumber;
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
		return Objects.hash(ReproductionLists, duration, id, reproductionNumber, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AudioPojo other = (AudioPojo) obj;
		return Objects.equals(ReproductionLists, other.ReproductionLists) && duration == other.duration
				&& id == other.id && reproductionNumber == other.reproductionNumber
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "AudioPojo [id=" + id + ", title=" + title + ", duration=" + duration + ", reproductionNumber="
				+ reproductionNumber + ", ReproductionLists=" + ReproductionLists + "]";
	}

}
