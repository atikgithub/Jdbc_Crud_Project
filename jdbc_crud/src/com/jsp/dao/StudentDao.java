package com.jsp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.Student;
import com.jsp.util.ConnectionObj;

public class StudentDao {
	public void createStudentTable() {
		Connection connection= ConnectionObj.getConnection();
		try {
			Statement statement=connection.createStatement();
			statement.execute("create table student(id int primary key,name varchar(40),phone bigint(10),age int)");
			connection.close();
			System.out.println("Table Created......");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	//------------------------------------------------------------------------------------------------------------
	public  Student save(Student student) {
		Connection connection= ConnectionObj.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setLong(3,student.getPhone());
			preparedStatement.setInt(4,student.getAge());
			preparedStatement.executeUpdate();
			connection.close();
			return student;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//-------------------------------------------------------------------------------------------------
     public Student updateStudent(Student student) {
    	 Connection connection= ConnectionObj.getConnection();
 		try {
 			PreparedStatement preparedStatement=connection.prepareStatement("update student set name=?,phone=?,age=? where id=?");
 			preparedStatement.setInt(4,student.getId());
 			preparedStatement.setString(1,student.getName());
 			preparedStatement.setLong(2,student.getPhone());
 			preparedStatement.setInt(3,student.getAge());
 			preparedStatement.executeUpdate();
 			connection.close();
 			//System.out.println("Data Updated");
 			return student;
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return null;
    	 
     }
    	//------------------------------------------------------------------------------------------------ 
     public String deleteStudent(int id) {
    	 Connection connection= ConnectionObj.getConnection();
    	 try {
			PreparedStatement preparedStatement= connection.prepareStatement("delete from student where id=?");
			preparedStatement.setInt(1,id);
			preparedStatement.executeUpdate();
			connection.close();
			return "Data Deleted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
     }
     //----------------------------------------------------------------------------------------------------------
     public List<Student> getAllStudent() {
    	 List<Student>list = new ArrayList<Student>();

    	 Connection connection= ConnectionObj.getConnection();
    	 Statement statement;
    	 try {
    		 statement =connection.createStatement();
    		 ResultSet resultSet= statement.executeQuery("select * from student");
    		 while(resultSet.next()) {
    			 Student student= new Student();
    			 student.setId(resultSet.getInt(1));
    			 student.setName(resultSet.getString(2));
    			 student.setPhone(resultSet.getLong(3));
    			 student.setAge(resultSet.getInt(4));
    			 list.add(student);
    			 
    		 }
    		 connection.close();
    		 return list;
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 return null;
     }
     //------------------------------------------------------------------------------------------------------
    	 public Student getStudentByID(int id) {
    			Student student = new Student();
    			Connection connection= ConnectionObj.getConnection();
    			
    			try {
    				PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id=?");
    				preparedStatement.setInt(1, id);
    				
    				ResultSet resultSet = preparedStatement.executeQuery();
    				while(resultSet.next()) {
    					student.setId(resultSet.getInt(1));
    					student.setName(resultSet.getString(2));
    					student.setPhone(resultSet.getLong(3));
    					student.setAge(resultSet.getInt(4));
    				}
    				connection.close();
    			} catch (SQLException e) {
    				e.printStackTrace();
    			}
    			return student;
    		}

     
}
