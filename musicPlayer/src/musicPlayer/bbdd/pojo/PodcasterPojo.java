package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PodcasterPojo extends OwnerPojo implements Serializable {

	private static final long serialVersionUID = 3556671960562717013L;

	private Date unionDate = null;

	private List<SeriePojo> Series = null;

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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Series, unionDate);
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
		PodcasterPojo other = (PodcasterPojo) obj;
		return Objects.equals(Series, other.Series) && Objects.equals(unionDate, other.unionDate);
	}

	@Override
	public String toString() {
		return "PodcasterPojo [unionDate=" + unionDate + ", Series=" + Series + "]";
	}

}
