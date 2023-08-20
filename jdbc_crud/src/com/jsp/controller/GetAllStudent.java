package com.jsp.controller;

import java.util.List;

import com.dto.Student;
import com.jsp.dao.StudentDao;

public class GetAllStudent {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		List<Student> list=dao.getAllStudent();
		for(Student student : list) {
			System.out.println("Student Id :"+student.getId());
			System.out.println("Student Name :"+student.getName());
			System.out.println("Student Age :"+student.getAge());
			System.out.println("Student Phone :"+student.getPhone());
			System.out.println("------------------------------------------");
		}
	
	}

}
