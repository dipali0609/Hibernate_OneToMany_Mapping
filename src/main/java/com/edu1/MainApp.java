package com.edu1;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) 
	{
	Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(LibraryBook.class);
	 SessionFactory sessionFactory=configuration.buildSessionFactory();
	 
	 Session session=sessionFactory.openSession();
	 
	 Transaction transaction=session.beginTransaction();
	 
	 LibraryBook libraryBook=new LibraryBook();
	 libraryBook.setBookname("XYZ");
	 
	 LibraryBook libraryBook1=new LibraryBook();
	 libraryBook1.setBookname("ABC");
	 
	 ArrayList<LibraryBook> list=new ArrayList<LibraryBook>();
	 list.add(libraryBook);
	 list.add(libraryBook1);
	 
	 Student student=new Student();
	 student.setStudentname("Dipali");
	 student.setList(list);
	 
	 
	 
	 
	 session.save(student);
	 session.save(libraryBook);
	 session.save(libraryBook1);
	 
     transaction.commit();
     session.close();
	}

}
