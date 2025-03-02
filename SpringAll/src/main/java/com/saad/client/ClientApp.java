package com.saad.client;

import java.awt.print.Book;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saad.bean.Candidate;
import com.saad.bean.Category;
import com.saad.bean.Client;
import com.saad.bean.Customer;
import com.saad.bean.Employee;
import com.saad.bean.RetailShop;
import com.saad.bean.Test;
import com.saad.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//Customer cst = (Customer)ac.getBean("cs");

//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//Employee emp1 = (Employee)ac.getBean("emp");
//System.out.println(emp1);


//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//Client c = (Client)ac.getBean("cl");
//System.out.println(c);
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		//RetailShop rts = (RetailShop)ac.getBean("rs");
		
//		Book b1 =  (Book)ac.getBean("bk");
//		System.out.println(b1);
		
		//Category c=(Category)ac.getBean("cg");
		
		//Candidate c=(Candidate)ac.getBean("cnd");
		//System.out.println(c);
		
		Test t1=(Test)ac.getBean("tst");
		Test t2=(Test)ac.getBean("tst");
		t1.setTestid("T1");
		t1.setTestnm("COREJAVATESTING");
		t1.setTestduration(15);
		t1.setTsoftware("JUNIT");
		
		
		t2.setTestid("T2");
		t2.setTestnm("INTEGRATIONTESTING");
		t2.setTestduration(25);
		t2.setTsoftware("SELENIUM");
		System.out.println(t1);
		System.out.println(t2);
		

	}

}
