package com.rosy1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapTest {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        problem p1=new problem();
	        p1.setProblemId(10);
	        p1.setProblem("what is java?");
	        
	        
	        Solution s1=new Solution();
	        s1.setSolutionId(20);
	        s1.setSolution("java is a object orianted programing language");
	        s1.setProblem(p1);
	        
	        
	        Solution s2=new Solution();
	        s2.setSolutionId(21);
	        s2.setSolution("java is a bagha");
	        s2.setProblem(p1);
	        
	        
	        Solution s3=new Solution();
	        s3.setSolutionId(22);
	        s3.setSolution("java has different fremworks");
	        s3.setProblem(p1);
	        
	        List<Solution> list=new ArrayList<Solution>();
	        list.add(s1);
	        list.add(s2);
	        list.add(s3);
	        
	        p1.setSolution(list);
	        
	        
	        Session s=factory.openSession();
	        Transaction ts=s.beginTransaction();
	        s.save(p1);
	        s.save(s1);
	        
	        s.save(s2);
	        s.save(s3);
	        
	        ts.commit();
	        s.close();
	        factory.close();
	}

}
