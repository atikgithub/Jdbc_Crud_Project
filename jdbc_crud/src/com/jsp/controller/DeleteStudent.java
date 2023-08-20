package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class DeleteStudent {

	public static void main(String[] args) {
		 StudentDao studentDao = new StudentDao();
	  	 String res =studentDao.deleteStudent(5);
	  	 if(res != null) {
	  		 System.out.println("Deleted data");
	  	 }else {
	  		 System.out.println("Plz check  the object");
	  	 }

	}
  
}
