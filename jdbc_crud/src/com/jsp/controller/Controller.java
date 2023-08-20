package com.jsp.controller;

import com.dto.Student;
import com.jsp.dao.StudentDao;


public class Controller {
 public static void main(String[] args) {
	 Student dto =new Student();
     dto.setId(5);
     dto.setName("Khan");
     dto.setPhone(956500000);
     dto.setAge(24);
     
//     StudentDao dao= new StudentDao();
// 	//dao.createStudentTable();
// 	 dao.save(dto);
 	 
 	 StudentDao studentDao = new StudentDao();
 	 Student student2 =studentDao.save(dto);
 	 if(student2 != null) {
 		 System.out.println("Data saved");
 	 }else {
 		 System.out.println("Plz check  the object");
 	 }
    
	
}
}
