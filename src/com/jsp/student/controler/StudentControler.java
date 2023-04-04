package com.jsp.student.controler;

import com.jsp.student.dao.Studentdao;
import com.jsp.student.dto.Student;

public class StudentControler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setId(3);
		student1.setName("osama");
		student1.setEmail("osama@gamil.com");
//		Student student2 = new Student();
//		student2.setId(2);
//		student2.setName("ahmed");
//		student2.setEmail("ahmed@gamil.com");
		
//		Studentdao studentdao = new Studentdao();
//		Student student = studentdao.saveStudent(student1);
//		
//		
//		
//		if(student!=null)		{
//			System.out.println("Successfully added"+student1.getName() );
//		}
//		
		
		Studentdao studentdao1 = new Studentdao();
//		 studentdao1.updateStuden("niraj",3);
//		 studentdao1.readStudent(1);
		 studentdao1.ReadAll();
		
		
		
		
		
		
		
		
		

		
	}

}
