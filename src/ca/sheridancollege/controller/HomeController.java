package ca.sheridancollege.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Student;
import ca.sheridancollege.beans.Subject;
import ca.sheridancollege.dao.DAO;

@Controller
public class HomeController {
	
	private DAO dao = new DAO();

	@RequestMapping("/")
	public String home(Model model){
		//Student student = new Student();
		//model.addAttribute("student", student);
		model.addAttribute("subjectList", dao.getSubjectList());
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
		//model.addAttribute("student", student);
		model.addAttribute("subjectList", dao.getSubjectList());
		return "home";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(Model model, @ModelAttribute Student student){
		System.out.println(student.toString());
		dao.insertStudent(student);
		//model.addAttribute("student", student);
		model.addAttribute("studentList", dao.getStudentList());
		return "displayStudents";
	}
	
	@RequestMapping(value="retrieve/{id}")
	public String updateCharacter(Model model, @PathVariable int id) {
		
		System.out.println(dao.getSubject(id).toString());
//		List<Student> listUpdated = dao.getStudentList();
//		
//		for(int i=0; i<listUpdated.size(); i++){
//			if(listUpdated.get(i).getId() == id)
//			{
//				model.addAttribute("studentDetail", listUpdated.get(i));
//			}
//		}
		model.addAttribute("subject", dao.getSubject(id));
		return "home";
	}
}
