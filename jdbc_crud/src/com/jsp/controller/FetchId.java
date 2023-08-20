package com.jsp.controller;

import com.dto.Student;
import com.jsp.dao.StudentDao;

public class FetchId {
	 public static void main(String[] args) {
			StudentDao studentDao = new StudentDao();
			Student student = studentDao.getStudentByID(1);
			if(student != null) {
				System.out.println("Student Id :"+student.getId());
				System.out.println("Student Name :"+student.getName());
				System.out.println("Student Age :"+student.getAge());
				System.out.println("Student Phone :"+student.getPhone());
			}
		}
}
