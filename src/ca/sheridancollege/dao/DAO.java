package ca.sheridancollege.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ca.sheridancollege.beans.Article;
import ca.sheridancollege.beans.Person;
import ca.sheridancollege.beans.Student;
import ca.sheridancollege.beans.Subject;

public class DAO {

	SessionFactory sessionFactory = new Configuration()
			.configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();
	public void insertSubject(Subject subject) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(subject);
		session.getTransaction().commit();
		session.close();
	}
	
	public void insertArticle(Article article) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(article);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Subject> getSubjectList(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Subject> criteria = criteriaBuilder.createQuery(Subject.class);
		Root<Subject> root = criteria.from(Subject.class);
		List<Subject> subjectList= session.createQuery(criteria).getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return subjectList;
	}
	
	public List<Article> getArticleList(String name){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Article> criteria = criteriaBuilder.createQuery(Article.class);
		Root<Article> root = criteria.from(Article.class);
		criteria.where(criteriaBuilder.equal(root.get("articleName"), name));
		
		List<Article> articleList = session.createQuery(criteria).getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return articleList;
	}
	
	public List<Subject> getSubject(String name){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Subject> criteria = criteriaBuilder.createQuery(Subject.class);
		Root<Subject> root = criteria.from(Subject.class);
		criteria.where(criteriaBuilder.equal(root.get("name"), name));
		List<Subject> subjectList= session.createQuery(criteria).getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return subjectList;
	}
	
	public String getSubjectName(int id){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Subject> criteria = criteriaBuilder.createQuery(Subject.class);
		Root<Subject> root = criteria.from(Subject.class);
		criteria.where(criteriaBuilder.equal(root.get("id"), id));
		List<Subject> subjectList= session.createQuery(criteria).getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return subjectList.get(0).getName();
	}
	
}
