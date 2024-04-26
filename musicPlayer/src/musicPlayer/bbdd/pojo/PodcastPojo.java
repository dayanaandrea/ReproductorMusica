package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Objects;

public class PodcastPojo extends AudioPojo implements Serializable {

	private static final long serialVersionUID = 8694101154275752023L;

	private SeriePojo serie = null;

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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(serie);
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
		PodcastPojo other = (PodcastPojo) obj;
		return Objects.equals(serie, other.serie);
	}

	@Override
	public String toString() {
		return "PodcastPojo [serie=" + serie + "]";
	}

}
