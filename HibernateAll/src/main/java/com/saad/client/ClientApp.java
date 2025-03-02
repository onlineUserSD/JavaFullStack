package com.saad.client;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.saad.entity.Adhar;
import com.saad.entity.Customer;
import com.saad.entity.Project;

//import com.saad.entity.Student;
//import com.saad.entity.Employee;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityTransaction tx=null;
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
		EntityManager em=emf.createEntityManager(); //adding updating and deleting data;
		tx=em.getTransaction(); //transaction created.
		tx.begin(); // begin the transaction.
		//Student sd1=new Student("100","ARUP","IT");
		//em.persist(sd1); //table created.
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		emp1.setEname("SUMAN");
//		emp1.setEdesig("MANAGER");
//		emp1.setSal(65000.00);
//		emp1.setHiredt(new Date());
//		emp1.setWorkhr(new Date());
//		
//		emp2.setEname("ALOKE");
//		emp2.setEdesig("ANALYST");
//		emp2.setSal(55000.00);
//		emp2.setHiredt(new Date());
//		emp2.setWorkhr(new Date());
//		em.persist(emp1);
//		em.persist(emp2);
				
//		Adhar ad1 = new Adhar("asdgj","KOLKATA");
//		Adhar ad2 = new Adhar("wwqrg","CHENNAI");
		
//		Customer c1 = new Customer("C1","ANNANYA",ad1);
//		Customer c2 = new Customer("C2","AYAN",ad2);
//		 
//		em.persist(ad2);
//		em.persist(ad1);
//		
//		em.persist(c2);
//		em.persist(c1);
		
		System.out.println("CRUD OPERATION");
		System.out.println("INSERT DATA-------");
//		
		Project pj1 = new Project("PR1","FULLSTACK","SPRINGBOOT",180);
		Project pj2 = new Project("PR2","WEBTECHNOLOGY","REACTJS",120);
//		em.persist(pj1);
//		em.persist(pj2);
        System.out.println("UPDATE DATA-------");
        Project ps=em.find(Project.class,"PR2");
        if(ps != null) {
        	ps.setProjnam("MOBILEAPP");
        	ps.setTech("REACTNATIVE");
        	ps.setDuration(150);
        	em.merge(ps);
        }
        
//		System.out.println("DELETING THE DATA------");
//		Project ps=em.find(Project.class,"PR1"); //select * from project where projid=PR1
//		if(ps != null) {
//			em.remove(ps);
//		}
		System.out.println("DISPLAY DATA----------");
		String jpql="select p from Project p";
		String hql="from Project";
		//Query query =em.createQuery(jpql);
		Query query =em.createQuery(hql);
		List<Project> plist=query.getResultList();
		plist.stream().forEach(System.out::println);
				
		tx.commit();
		emf.close();

	}

}
