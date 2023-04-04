package com.jsp.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.student.dto.Student;
import com.jsp.student.util.HelperClass;

public class Studentdao {
	
	HelperClass helperClass = new HelperClass();
	
	
	public Student saveStudent(Student student)
	{
		Connection connection = helperClass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		try {
			PreparedStatement preparedstatement =  connection.prepareStatement(sql);
			preparedstatement.setInt(1,student.getId());
			preparedstatement.setString(2, student.getName());
			preparedstatement.setString(3,student.getEmail());
			
			preparedstatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new Student();
		
		
	}
	
	public void updateStuden(String name,int id)
	{
		Connection connection = helperClass.getConnection();
		String sql = "UPDATE student SET name=? WHERE id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			
			preparedStatement.execute();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void deletStuden(int id)
	{

		
		Connection connection= helperClass.getConnection();
		
		String sql = "DELETE FROM student where id = ?";
		
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			preparedStatement.execute();
			
			
			System.out.println("Successfully Deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void readStudent(int id)
	{
		Connection connection = helperClass.getConnection();
		String sql = "Select * from student where id = ?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			ResultSet resultset = preparedStatement.executeQuery();
			
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println("==========================");
				
			}	
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			System.out.println("Read");
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		

		
	}
	
	
	public void ReadAll()
	{
	 	Connection connection= helperClass.getConnection();
	 	String sql = "Select * from student";
	 	try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultset = preparedStatement.executeQuery();
			
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println("==========================");
				
			}				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	finally {
	 		System.out.println("Read ALL");
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 	}
	 	
	}
	

}
