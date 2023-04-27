package com.bapi.practis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class pomCS {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        student student1=new student();
	        student1.setId(20);
	        student1.setName("sonny Leon");
	        student1.setCity("champua");
	        
	        cirtificat cate=new cirtificat();
	        cate.setCourse("java developer");
	        cate.setDuration("6 month");
	        student1.setCirt(cate);
	        
	        student student2=new student();
	        student2.setId(21);
	        student2.setName("jony Leon");
	        student2.setCity("turmunga");
	        
	        cirtificat cate1=new cirtificat();
	        cate1.setCourse("python developer");
	        cate1.setDuration("5.5 month");
	        student2.setCirt(cate1);
	        
	        Session s=factory.openSession();
	        Transaction ts=s.beginTransaction();
	        s.save(student1);
	        s.save(student2);
	        ts.commit();
	        s.close();
	        factory.close();
	}

}
