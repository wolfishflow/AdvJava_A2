package ca.sheridancollege.beans;

import javax.persistence.Embedded;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@SelectBeforeUpdate
@DynamicUpdate
@Entity
public class Subject {

	//Vars
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Embedded
	private Article article;
	
	//Getter & Setters
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
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	//Constructors
	public Subject() {
	}
	public Subject(String name, Article article) {
		this.name = name;
		this.article = article;
	}
	
	//To String
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", article=" + article + "]";
	}
	
	
}
