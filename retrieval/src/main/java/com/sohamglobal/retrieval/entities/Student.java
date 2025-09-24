package com.sohamglobal.retrieval.entities;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="students")
	public class Student {
		
		@Id
		private int rollno;
		private String studnm;
		private String course;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getStudnm() {
			return studnm;
		}
		public void setStudnm(String studnm) {
			this.studnm = studnm;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		
		
	}

