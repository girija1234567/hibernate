package com.DAO;

import java.util.List;

import com.pojo.Student;

public interface DAOClass {
public String Insert(String name,String dept);
public String Update(Student s);
public String RetrieveDetails(int id);
public String Delete(int eid);
public List<Student> getAll();
	
}
