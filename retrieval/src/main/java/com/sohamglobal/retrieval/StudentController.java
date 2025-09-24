package com.sohamglobal.retrieval;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.retrieval.entities.Student;
import com.sohamglobal.retrieval.services.StudentServices;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServices studServ;
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/all")
	public String showStudents(Model m)
	{
		List<Student> list=studServ.getAllStudents();
		//list.stream().forEach(obj->System.out.println(obj.getStudnm()));
		m.addAttribute("stlist", list);
		return "AllStudents.jsp";
	}
	
	@PostMapping("/search")
	public String search(String course,Model m) {
		List<Student> list=studServ.SearchOnCourse(course);
		m.addAttribute("stlist",list);
		return "AllStudents.jsp";
	}
	
	@PostMapping("/searchrange")
	public String searchrange(int min,int max,Model m) {
		
		List<Student> list=studServ.SearchOnRollRange( min,max);
		m.addAttribute("stlist",list);
		return "AllStudents.jsp";
	}
	
	@PostMapping("/searchonprefix")
	public String SearchPrefix(String prefix,Model m) {
		List<Student> list=studServ.SearchOnPrefix(prefix);
		m.addAttribute("stlist",list);
		return "AllStudents.jsp";
	}
	
	@PostMapping("/countcourse")
	public String Countcourse(String course,Model m) {
		long num=studServ.Searchoncourse(course);
		m.addAttribute("num",num);
		return "Studentscount.jsp";
	}
	@GetMapping("/searchbyorder")
	public String SearchOrder(Model m) {
		List<Student> list=studServ.findorderbyname();
		m.addAttribute("stlist",list);
		return "AllStudents.jsp";
	}
	
	@GetMapping("/searchbyrollno")
	public String SearchRollno(Model m) {
		List<Student> list=studServ.Findorder();
		m.addAttribute("stlist",list);
		return "AllStudents.jsp";
		
	}
	
	
	
	
	

}