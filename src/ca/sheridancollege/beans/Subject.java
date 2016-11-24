package ca.sheridancollege.beans;

import javax.persistence.Embedded;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@SelectBeforeUpdate
@DynamicUpdate
@Entity
public class Subject {

	//Vars
//	@Id
//	@GeneratedValue
//	private int id;
	@Id
	private String name;
	@OneToMany
	private List<Article> article;
	
	//Getter & Setters
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Subject [name=" + name + ", article=" + article + "]";
	}
	
	
}
