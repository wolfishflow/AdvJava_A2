package ca.sheridancollege.beans;

import java.util.Date;

import javax.persistence.Column;

public class Article {
	
	//Vars
	private String articleName;
	private Date lastModified;
	private String editor;
	@Column(columnDefinition="LONGBLOB")
	private String contents;
	
	//Getters & Setters
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
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
	public Article(String articleName, Date lastModified, String editor, String contents) {
		this.articleName = articleName;
		this.lastModified = lastModified;
		this.editor = editor;
		this.contents = contents;
	}
	public Article(){
		
	}
	
	//To String
	@Override
	public String toString() {
		return "Article [articleName=" + articleName + ", lastModified=" + lastModified + ", editor=" + editor + ", contents="
				+ contents + "]";
	}
	
}
