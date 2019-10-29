package com.frontepic.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			////////////////////////////////////////////////////////////////////////// Create
			
			Employee emp = new Employee("Ronald", "McDonald", "McDonald's");
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			
			////////////////////////////////////////////////////////////////////////// Retrieve
			
			//		A
//			int empId = 1;
//			
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, empId);
//			System.out.println(emp);
//			session.getTransaction().commit();
			
			//		B
//			session.beginTransaction();
//			List<Employee> emps = session
//					.createQuery("from Employee e where e.lastName='Doe'")
//					.getResultList();
//			
//			for(Employee emp: emps)
//				System.out.println(emp);
//			
//			session.getTransaction().commit();
			
			////////////////////////////////////////////////////////////////////////// Update

			//		A
//			int empId = 2;
//			
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, empId);
//			emp.setCompany("The Boring Company");
//			session.getTransaction().commit();
			
			//		B
//			int empId = 1;
//			
//			session.beginTransaction();
//			session
//				.createQuery("update Employee e set e.company='-' where e.id=" + empId)
//				.executeUpdate();
//			session.getTransaction().commit();
			
			////////////////////////////////////////////////////////////////////////// Delete
			
			//			A
//			int empId = 2;
			
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, empId);
//			session.delete(emp);
//			session.getTransaction().commit();
			
			//		B
//			int empId = 1;
//			
//			session.beginTransaction();
//			session
//				.createQuery("delete from Employee where id=" + empId)
//				.executeUpdate();
//			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
