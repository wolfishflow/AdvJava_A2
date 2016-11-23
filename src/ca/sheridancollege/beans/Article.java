package ca.sheridancollege.beans;

import java.util.Date;

import javax.persistence.Column;

public class Article {
	
	//Vars
	private String name;
	private Date lastModified;
	private String editor;
	@Column(columnDefinition="LONGBLOB")
	private String contents;
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	//Constructors
	public Article(String name, Date lastModified, String editor, String contents) {
		this.name = name;
		this.lastModified = lastModified;
		this.editor = editor;
		this.contents = contents;
	}
	public Article(){
		
	}
	
	
	//To String
	@Override
	public String toString() {
		return "Article [name=" + name + ", lastModified=" + lastModified + ", editor=" + editor + ", contents="
				+ contents + "]";
	}
	
	
}
