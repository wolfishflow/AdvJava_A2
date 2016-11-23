package ca.sheridancollege.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ca.sheridancollege.beans.Person;
import ca.sheridancollege.beans.Student;

public class DAO {

	SessionFactory sessionFactory = new Configuration()
			.configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();

	public void insertStudent(Student student) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public void transaction() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Student> getStudentList(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from Student");
		List<Student> studentList= (List<Student>) query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return studentList;
	}
	
	public Student getStudent(int id){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from Student");
		Student student= (Student) query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return student;
	}
	
}
