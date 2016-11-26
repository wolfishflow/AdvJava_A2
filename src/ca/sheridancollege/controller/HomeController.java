package ca.sheridancollege.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Article;
import ca.sheridancollege.beans.Subject;
import ca.sheridancollege.dao.DAO;

@Controller
public class HomeController {
	
	private DAO dao = new DAO();
	private Subject placeholder;

	/*Features:
	Tiny MCE for editing and manipulating the contents of the article in the wiki.
	JUnit Tests for testing the application.
	Javascript for client side validation only seems to work on modern browsers ie; Chrome or FireFox
	*/
	//Home
	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("subjectList", dao.getSubjectList());
		System.out.println(dao.getSubjectList().toString());
		return "home";
	}
	//Get
	@RequestMapping(value="/retrieve/{name}")
	public String getSubjectArticles(Model model, @PathVariable String name) {
		placeholder = dao.getSubject(name).get(0);
		model.addAttribute("articleList", dao.getSubject(name).get(0).getArticleList());
		model.addAttribute("subjectName", name);
		return "displaySubject";
	}
	//Get
	@RequestMapping(value="/article/{name}")
	public String getArticle(Model model, @PathVariable String name) {
		System.out.println(dao.getArticleList(name).get(0));
		model.addAttribute("articleValue", dao.getArticleList(name).get(0));
		return "displayArticle";
	}
	
	//Add
	@RequestMapping("/add")
	public String addSubject(Model model){
		Subject subject = new Subject();
		model.addAttribute("subject", subject);
		return "addSubject";
	}
	//Add
	@RequestMapping("/addArticle/{name}")
	public String addArticle(Model model, @PathVariable String name){
		placeholder = dao.getSubject(name).get(0);
		System.out.println(placeholder.toString());
		model.addAttribute("subjectName", name);
		model.addAttribute("article", new Article());
		return "addArticle";
	}
	//Save
	@RequestMapping("/saveSubject")
	public String saveSubject(Model model, @ModelAttribute Subject subject){
		System.out.println(subject.toString());
		dao.insertSubject(subject);
		model.addAttribute("subjectList", dao.getSubjectList());
		return "home";
	}
	//Save
	@RequestMapping("/saveArticle")
	public String saveArticle(Model model, @ModelAttribute Article article){
		Date date = new Date();
		Article insert = article;
		insert.setLastModified(date);
		System.out.println(insert.toString());
		insert.setSubjectBean(placeholder);
		dao.insertArticle(insert);
		model.addAttribute("subjectList", dao.getSubjectList());
		model.addAttribute("articleValue", dao.getArticleList(article.getArticleName()).get(0));
		return "displayArticle";
	}
	
	//edit
		@RequestMapping("/editArticle")
		public String editArticle(Model model, @ModelAttribute Article article){
			Date date = new Date();
			Article insert = article;
			insert.setLastModified(date);
			System.out.println(insert.toString());
			insert.setSubjectBean(placeholder);
			dao.insertArticle(insert);
			model.addAttribute("subjectList", dao.getSubjectList());
			model.addAttribute("articleValue", dao.getArticleList(article.getArticleName()).get(0));
			return "displayArticle";
		}
		
		@RequestMapping("/edit/{articleName}")
		public String redirect(Model model, @PathVariable String articleName){
			System.out.println(dao.getArticleList(articleName).get(0).toString());
			model.addAttribute("articleValue", dao.getArticleList(articleName).get(0));
			model.addAttribute("article", dao.getArticleList(articleName).get(0));
			return "editArticle";
		}
	
	
	
	
}
