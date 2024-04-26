package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ReproductionListPojo implements Serializable {

	private static final long serialVersionUID = -2042868949492796L;

	private int id = 0;
	private String title = null;
	private int songNumbers = 0;

	private UserPojo username = null;
	private List<AudioPojo> audios = null;

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

	public int getSongNumbers() {
		return songNumbers;
	}

	public void setSongNumbers(int songNumbers) {
		this.songNumbers = songNumbers;
	}

	public UserPojo getUsername() {
		return username;
	}

	public void setUsername(UserPojo username) {
		this.username = username;
	}

	public List<AudioPojo> getAudios() {
		return audios;
	}

	public void setAudios(List<AudioPojo> audios) {
		this.audios = audios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(audios, id, songNumbers, title, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReproductionListPojo other = (ReproductionListPojo) obj;
		return Objects.equals(audios, other.audios) && id == other.id && songNumbers == other.songNumbers
				&& Objects.equals(title, other.title) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "ReproductionListPojo [id=" + id + ", title=" + title + ", songNumbers=" + songNumbers + ", username="
				+ username + ", audios=" + audios + "]";
	}

}
