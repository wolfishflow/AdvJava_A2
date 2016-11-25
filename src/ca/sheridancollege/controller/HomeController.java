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
import ca.sheridancollege.beans.Student;
import ca.sheridancollege.beans.Subject;
import ca.sheridancollege.dao.DAO;

@Controller
public class HomeController {
	
	private DAO dao = new DAO();
	private Subject placeholder;

	@RequestMapping("/")
	public String home(Model model){
		//Student student = new Student();
		//model.addAttribute("student", student);
		model.addAttribute("subjectList", dao.getSubjectList());
		System.out.println(dao.getSubjectList().toString());
		return "home";
	}
	
	@RequestMapping("/add")
	public String addSubject(Model model){
		Subject subject = new Subject();
		model.addAttribute("subject", subject);
		return "addSubject";
	}
	
	@RequestMapping("/saveSubject")
	public String saveSubject(Model model, @ModelAttribute Subject subject){
		System.out.println(subject.toString());
		dao.insertSubject(subject);
		model.addAttribute("subjectList", dao.getSubjectList());
		return "home";
	}
	
	@RequestMapping("/saveArticle")
	public String saveArticle(Model model, @ModelAttribute Article article){
		//System.out.println(article.toString());
		Date date = new Date();
		Article insert = article;
		insert.setLastModified(date);
		System.out.println(insert.toString());
		insert.setSubjectBean(placeholder);
		dao.insertArticle(insert);
		model.addAttribute("subjectList", dao.getSubjectList());
		return "home";
	}
	
	@RequestMapping("/addArticle/{name}")
	public String addArticle(Model model, @PathVariable String name){
		placeholder = dao.getSubject(name).get(0);
		System.out.println(placeholder.toString());
		model.addAttribute("subjectName", name);
		model.addAttribute("article", new Article());
		return "addArticle";
	}
	
	@RequestMapping(value="retrieve/{name}")
	public String updateCharacter(Model model, @PathVariable String name) {
		model.addAttribute("articleList", dao.getSubject(name).get(0).getArticleList());
		model.addAttribute("subjectName", name);
		return "displaySubject";
	}
}
