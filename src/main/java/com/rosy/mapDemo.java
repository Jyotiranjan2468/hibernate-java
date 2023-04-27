package com.rosy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
//        Object of question
        Question que=new Question();
        que.setQuestionId(102);
        que.setQuestion("what is java?");
		
        
//        Object of answer
        Answer answer=new Answer();
        answer.setAnswerId(201);
        answer.setAnswer("java is object orianted programing language.");
        answer.setQuestion(que);
        que.setAnswer(answer);
        
        
        Question que1=new Question();
        que1.setQuestionId(103);
        que1.setQuestion("what is JDK?");
       
		
        
//        Object of answer
        Answer answer1=new Answer();
        answer1.setAnswerId(202);
        answer1.setAnswer("JDK stands for java development kit.");
        answer1.setQuestion(que1);
        que1.setAnswer(answer1);
        
        
        Session s=factory.openSession();
        Transaction ts=s.beginTransaction();
        s.save(que);
        s.save(answer);
        
        s.save(que1);
        s.save(answer1);
        
        ts.commit();
        
        Question newQ=(Question)s.get(Question.class, 103);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswer());
       
        s.close();
        factory.close();
	}

}
