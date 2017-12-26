package hibernateProblem;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DAO.Imp;
import com.pojo.Student;

public class hibernateProblem {
	
	public static void main(String[] args){
	/*	SessionFactory sf = new Configuration().configure().buildSessionFactory();
		try{
			System.out.println("okay");
			
			Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student t=new Student();
		t.setEmp_id(212);
		t.setEmp_name("raj");
		t.setEmp_dept("IT");
	
	
	session.save(t);
	//session.update(s1);
	System.out.println("okay123");
	tx.commit();
	
	session.close();
	sf.close();
		}catch(HibernateException e){
			e.printStackTrace();
		}
	//System.out.println(t);   */
		Student s1=new Student();
		  Session session = new Configuration().configure().buildSessionFactory().openSession();
		Scanner s=new Scanner(System.in);
		System.out.println("1.insertion");
		System.out.println("2.deletion");
		System.out.println("3.updation");
		System.out.println("4.Retrieval");
		System.out.println("5.retrieve all");
		System.out.println("enter your option");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			Imp i1=new Imp();
			i1.Insert("giri", "ECE");
			break;
		case 2:
			Imp i2=new Imp();
			i2.Delete(22);
			break;
		case 3:
			Imp i3=new Imp();
			System.out.println("enter id");
			int id=s.nextInt();
			System.out.println("enter ename");
			String str1=s.next();
			System.out.println("enter edept");
			String str2=s.next();
			s1.setEmp_id(id);
			s1.setEmp_name(str1);
			s1.setEmp_dept(str2);
			i3.Update(s1);
			break;
		case 4:
			Imp i4=new Imp();
			i4.RetrieveDetails(23);
			break;
		case 5:
			Imp i5=new Imp();
		List<Student> l1=i5.getAll();
		for(Student g:l1)
			System.out.println(g);
			break;
		default:
			System.out.println("please select the correct option");
		}
	}
}
