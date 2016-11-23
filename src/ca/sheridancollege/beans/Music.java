package ca.sheridancollege.beans;

import java.util.Arrays;

import javax.persistence.Embeddable;

@Embeddable
public class Music {
	
	@Override
	public String toString() {
		return "Music [instrument=" + instrument + ", songWriter=" + songWriter + ", genre=" + genre + ", genres="
				+ Arrays.toString(genres) + "]";
	}

	private String instrument;
	private Boolean songWriter;
	private String genre;
	private String[] genres;
	
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public Boolean getSongWriter() {
		return songWriter;
	}
	public void setSongWriter(Boolean songWriter) {
		this.songWriter = songWriter;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	
	public Music(){
		this.genres = new String[]{"Pop", "Indie", "Spoken Word", "Electronic", "Classical"};
	}
	
	public Music(String instrument, Boolean songWriter, String genre) {
		this.instrument = instrument;
		this.songWriter = songWriter;
		this.genre = genre;
		this.genres = new String[]{"Pop", "Indie", "Spoken Word", "Electronic", "Classical"};
	}
	
	
}
