package ca.sheridancollege.beans;

import java.util.Date;

import javax.persistence.Column;

public class Article {
	
	private String name;
	private Date lastModified;
	private String editor;
	@Column(columnDefinition="LONGBLOB")
	private String contents;
	
	
}
