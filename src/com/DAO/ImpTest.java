package com.DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pojo.Student;

public class ImpTest {

	@Test
	public void InsertTest()
	{
		Imp it=new Imp();
		Student s=new Student();
		//s.setEmp_name("Hemu");
		//s.setEmp_dept("ECE");
		
		assertEquals("true", it.Insert("Geetha", "Ece"));
	}
	@Test
	public void deleteTest()
	{
		Imp i=new Imp();
		Student s=new Student();
		assertEquals("true",i.Delete(10));
	}
	@Test
	public void RetrieveTest()
	{

		Imp i=new Imp();
		Student s=new Student();
		assertEquals("true",i.RetrieveDetails(20));
	}

}
