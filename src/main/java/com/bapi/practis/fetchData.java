package com.bapi.practis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class fetchData {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session session=factory.openSession();
	        
	        student student=(student)session.get(student.class, 108);
	        System.out.println(student);
	        
//	        Address address=(Address)session.get(Address.class, 1);
//	        System.out.println(address);
	        
	        session.clear();
	        factory.close();
	}

}
