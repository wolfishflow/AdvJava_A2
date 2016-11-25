package ca.sheridancollege.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@SelectBeforeUpdate
@DynamicUpdate
@Entity
public class Subject {

	// Vars
	// @Id
	// @GeneratedValue
	// private int id;
	@Id
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subjectBean", fetch = FetchType.EAGER)
	private List<Article> articleList;

	// Getter & Setters
	// public int getId() {
	// return id;
	// }
	// public void setId(int id) {
	// this.id = id;
	// }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	// Constructors
	public Subject() {
	}

	public Subject(String name) {
		this.name = name;
	}

	// To String
	@Override
	public String toString() {
		return "Subject [name=" + name + ", articleList=" + articleList + "]";
	}

}
