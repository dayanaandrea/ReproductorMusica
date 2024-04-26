package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SeriePojo implements Serializable {

	private static final long serialVersionUID = -2726087116610802283L;

	private int idSeries = 0;
	private String title = null;
	private Date startDate = null;
	private Date endDate = null;
	private String description = null;
	private int reproductionNumber = 0;

	private List<PodcastPojo> Podcasts = null;
	private SeriePojo serie = null;

	public int getIdSeries() {
		return idSeries;
	}

	public void setIdSeries(int idSeries) {
		this.idSeries = idSeries;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public List<PodcastPojo> getPodcasts() {
		return Podcasts;
	}

	public void setPodcasts(List<PodcastPojo> podcasts) {
		Podcasts = podcasts;
	}

	public SeriePojo getSerie() {
		return serie;
	}

	public void setSerie(SeriePojo serie) {
		this.serie = serie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Podcasts, description, endDate, idSeries, reproductionNumber, serie, startDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeriePojo other = (SeriePojo) obj;
		return Objects.equals(Podcasts, other.Podcasts) && Objects.equals(description, other.description)
				&& Objects.equals(endDate, other.endDate) && idSeries == other.idSeries
				&& reproductionNumber == other.reproductionNumber && Objects.equals(serie, other.serie)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "SeriePojo [idSeries=" + idSeries + ", title=" + title + ", startDate=" + startDate + ", endDate="
				+ endDate + ", description=" + description + ", reproductionNumber=" + reproductionNumber
				+ ", Podcasts=" + Podcasts + ", serie=" + serie + "]";
	}

}
