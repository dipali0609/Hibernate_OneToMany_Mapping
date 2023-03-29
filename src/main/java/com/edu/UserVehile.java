package com.edu;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UserVehile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Vehicle.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step
		Transaction transaction =session.beginTransaction();
		
		User user=new User();
		user.setUsername("Dipali");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVname("car");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVname("bike");
		
		
		ArrayList<Vehicle> vehiclelist=new ArrayList<Vehicle>();
		vehiclelist.add(vehicle);
		vehiclelist.add(vehicle1);
		
		user.setVehicle(vehiclelist);
		
		
//		Department department = new Department();
//		department.setDepartmentName("Sales");
//
//		//create employee object
//		Employee emp1 = new Employee("Nina", "Mayers", "111");
//		Employee emp2 = new Employee("Tony", "Almeida", "222");
		
//		ArrayList<Employee>emplist=new ArrayList<Employee>();
//		emplist.add(emp1);
//		emplist.add(emp2);
//		department.setEmployees(emplist);
		
		
		session.save(user);
		session.save(vehicle);
		session.save(vehicle1);
		transaction.commit();
		session.close();
		
	}

}
