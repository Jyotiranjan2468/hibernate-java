package com.rosy2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapTest2 {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        
//	        object of employ
	        Emp e=new Emp();
	        Emp e1=new Emp();
	        
	        e.seteId(10);
	        e.seteName("bapi");
	        
	        e1.seteId(11);
	        e1.seteName("api");
	        
//	        object of project
	        Project p=new Project();
	        Project p1=new Project();
	        
	        p.setProjectId(20);
	        p.setProjectName("spotify");
	        
	        p1.setProjectId(21);
	        p1.setProjectName("musically");
	        
	        List<Emp> l1=new ArrayList<>();
	        List<Project> l2=new ArrayList<>();
	        
	        
	        l1.add(e);
	        l1.add(e1);
	        
	        l2.add(p);
	        l2.add(p1);
	        
	        e.setProject(l2);
	        p1.setEmp(l1);
	        
	        Session s=factory.openSession();
	        Transaction ts=s.beginTransaction();
	     
	        s.save(e);
	        s.save(e1);
	        s.save(p);
	        s.save(p1);
	        
	        ts.commit();
	        s.close();
	        factory.close();
	}

}
