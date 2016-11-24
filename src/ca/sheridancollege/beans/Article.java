package ca.sheridancollege.beans;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
@SelectBeforeUpdate
@DynamicUpdate
@Entity
public class Article {
	
	//Vars
	@Id
	private String articleName;
	private Calendar lastModified;
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
	public Calendar getLastModified() {
		return lastModified;
	}
	public void setLastModified(Calendar lastModified) {
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
	public Article(String articleName, Calendar lastModified, String editor, String contents) {
		this.articleName = articleName;
		this.lastModified = lastModified;
		this.editor = editor;
		this.contents = contents;
	}
	public Article(String articleName, String editor, String contents) {
		this.articleName = articleName;
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
