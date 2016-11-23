package ca.sheridancollege.beans;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@SelectBeforeUpdate
@DynamicUpdate
@Entity
@NamedQueries({
	@NamedQuery(name="Student.up", query="select id from Student WHERE id=:id"),
	@NamedQuery(name="Student.getem", query="FROM Student where id=:id")
})
public class Student implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Embedded
	private Music music;
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", music=" + music + "]";
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public Student(String name, Music music) {
		this.name = name;
		this.music = music;
	}

	public Student() {
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

}
