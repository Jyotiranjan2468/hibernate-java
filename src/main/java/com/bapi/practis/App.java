package com.bapi.practis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started....." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
//        creat student object
        student stu=new student();
        stu.setId(106);
        stu.setName("jyotiranjan");
        stu.setCity("keonjhar");
        System.out.println(stu);
        

        
//        creat address object
        System.out.println("Its ok");
       Address ad=new Address();
       ad.setStreet("Street1");
       ad.setCity("Bhubaneswer");
       ad.setOpen(true);
       ad.setAddedDate(new Date());
       ad.setX(231.34);
//        set image
        FileInputStream is=new FileInputStream("src/main/java/img.png");
        byte[] data=new byte[is.available()];
        is.read(data);
        ad.setImage(data);
        
        
        
        Session session=factory.openSession();
        Transaction ts=session.beginTransaction();
        session.save(stu);
        session.save(ad);
        ts.commit();
        session.close();
        System.out.println("Done");
    }
}
