package com.jsp.controller;

import com.dto.Student;
import com.jsp.dao.StudentDao;

public class UpdateStudent {

	public static void main(String[] args) {
      Student student= new Student();
      student.setId(1);
      student.setName("Rani");
      student.setAge(21);
      student.setPhone(9888888888l);
      
     StudentDao studentDao = new StudentDao();
  	 Student student2 =studentDao.updateStudent(student);
  	 if(student2 != null) {
  		 System.out.println("Update data");
  	 }else {
  		 System.out.println("Plz check  the object");
  	 }
     
	}

}
