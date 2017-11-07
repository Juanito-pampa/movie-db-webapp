package fr.sopra.training;

import java.util.Date;
import java.util.List;

public class Movie {
	private int id;
	private String name;
	private Date releaseDate;
	public Movie(String name, Date releaseDate, Studio studio, List<Actor> actors) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.studio = studio;
		this.actors = actors;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Studio getStudio() {
		return studio;
	}
	public void setStudio(Studio studio) {
		this.studio = studio;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	private Studio studio;
	private List<Actor> actors;
}
