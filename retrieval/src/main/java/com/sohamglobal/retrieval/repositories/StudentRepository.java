package com.sohamglobal.retrieval.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sohamglobal.retrieval.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	//Derived Query method
		Student findByRollno(int rollno);
		List<Student> findByCourse(String course);
		List<Student> findByRollnoGreaterThan(int value);
		
		//Custom queries
		@Query("select s from Student s where s.rollno between :min and :max")
		List<Student> findStudentsInRollnoRange(@Param("min") int min,@Param("max") int max);
		
		@Query("SELECT s FROM Student s WHERE s.studnm LIKE :prefix%")
		List<Student> findByNameStartingWith(@Param("prefix") String prefix);
		
		@Query("SELECT COUNT(s) FROM Student s WHERE s.course = :course")
		long countByCourse(@Param("course") String course);

		@Query("SELECT s FROM Student s ORDER BY s.studnm DESC")
		List<Student> findAllOrderByName();
		
		@Query("select s from Student  s order by s.rollno desc")
		List<Student> findAllByRollno();

}