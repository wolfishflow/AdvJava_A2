package ca.sheridancollege.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.sheridancollege.beans.Article;
import ca.sheridancollege.beans.Subject;
import ca.sheridancollege.dao.DAO;

public class HomeControllerTest {
	
	private DAO dao = new DAO();
	
	@Test
	public void getPlaceholderValue() {
		Subject placeholder = dao.getSubject("Simon").get(0);
		assertNotNull(placeholder);
	}
	
	@Test
	public void getArticle() {
		Article article = new Article(null, null, null, null);
		assertEquals(article, dao.getArticleList("").get(0));
	}
	
	

}
