package fr.sopra.training;

import java.util.Date;

public class Studio {
	private int id;
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
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	private String name;
	private Date creationDate;
	public Studio(String name, Date creationDate) {
		super();
		this.name = name;
		this.creationDate = creationDate;
	}
	
	
}