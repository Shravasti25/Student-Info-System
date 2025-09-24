package com.sohamglobal.retrieval.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.retrieval.entities.Student;
import com.sohamglobal.retrieval.repositories.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> getAllStudents()
	{
		List<Student> list=studRepo.findAll();
		return list;
	}
	
	public List<Student> SearchOnCourse(String course){
	List<Student> list =studRepo.findByCourse(course);
	return list;
	}
	
	public List<Student> SearchOnRollRange(int min,int max){
		 List<Student> list=studRepo.findStudentsInRollnoRange(min,max);
		 return list;
	}

	public List<Student> SearchOnPrefix(String prefix){
		List<Student> list=studRepo.findByNameStartingWith(prefix);
		return list;
	}
	
	public long Searchoncourse(String course) {
		long num=studRepo.countByCourse(course);
		return num;
	}
	
	public List<Student> findorderbyname() {
	List<Student> list=studRepo.findAllOrderByName();
	return list;
	}
	
	public List<Student> Findorder(){
		List<Student> list =studRepo.findAllByRollno();
		return list;
	}
	
	
}