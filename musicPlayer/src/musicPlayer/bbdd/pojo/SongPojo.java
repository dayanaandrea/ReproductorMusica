package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Objects;

public class SongPojo extends AudioPojo implements Serializable {

	private static final long serialVersionUID = 458070957532373602L;

	private DiskPojo disk = null;

	public DiskPojo getDisk() {
		return disk;
	}

	public void setDisk(DiskPojo disk) {
		this.disk = disk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(disk);
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
		SongPojo other = (SongPojo) obj;
		return Objects.equals(disk, other.disk);
	}

	@Override
	public String toString() {
		return "SongPojo [disk=" + disk + "]";
	}

}
