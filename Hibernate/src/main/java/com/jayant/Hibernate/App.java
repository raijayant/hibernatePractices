package com.jayant.Hibernate;


import java.util.Collection;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{

	public static void main( String[] args ) 
    {
		
		EntityManagerFactory emf = new Persistence().createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		
		
		
//		Laptop laptop = new Laptop();
//		laptop.setLid(101);
//		laptop.setLname("Mac");
		
//		Alien a = new Alien();
//		a.setAid(1);
//		a.setAname("Jayant");
//		
//		a.setAid(2);
//		a.setAname("Kalpana");
//		a.setAid(3);
//		a.setAname("Jiri");
	
//		Laptop laps = new Laptop();
//
//		laps.setLid(101);
//		laps.setBrand("Dell");
//		laps.setPrice(1000);
//		laps.getAlien().add(a);
//		
//		
//		laps.setLid(102);
//		laps.setBrand("Mac");
//		laps.setPrice(1500);
		
//		laps.setLid(103);
//		laps.setBrand("Asus");
//		laps.setPrice(500);
		
//		laps.setLid(104);
//		laps.setBrand("HP");
//		laps.setPrice(1500);
		
//		
//		laps.setLid(105);
//		laps.setBrand("Samsung");
//		laps.setPrice(2000);
//		
		
//		Student student = new Student();
//		student.setName("Jayant");
//		student.setRollno(1);
//		student.setMarks(50);
//		student.getLaptop().add(laptop);
//		
//		laptop.getStudent().add(student);
//		
		
//       Alien telusko = new Alien();
		// we can also say null
//		AlienName an = new AlienName();
//		an.setFname("Jayant");
//		an.setLname("Rai");
//		an.setMname("Chamling");
//
//		
//		Alien telusko = new Alien();
//		telusko.setAid(101);
//		telusko.setColor("Green");
//		telusko.setAname(an);
//       
//       telusko.setAid(107);
//       telusko.setAname("New York");
//       telusko.setColor("Blue");
		
//	       session.save(laps);
//	       session.save(student);
		
		
		
//		Alien a = null;
	   
       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
       
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       
       SessionFactory sf = con.buildSessionFactory(reg);
      
       Session session1 = sf.openSession();
       
//       session 1
       session1.beginTransaction();
//       a = (Alien) session1.get(Alien.class, 101);
//       instead of fetcing data like above we can also use query
       
//       Query q1 = session1.createQuery("from Alien where aid=101");
//       q1.setCacheable(true);
//       a = (Alien) q1.uniqueResult();
//       System.out.println(a);
       
//        core concept of java
//       Random r = new Random();
//       
//      
//       for(int i=1; i<= 50; i++)
//       {
//    	   Student s = new Student();
//    	   s.setRollno(i);
//    	   s.setName("Name " + i);
//    	   s.setMarks(r.nextInt(100));
//    	   session1.save(s);
//       }
       
//       implemenation of hql in hibernate
       
       Query q = session1.createQuery("select rollno, name, marks from Student");
//       List<Student> students = q.list();
//       Student student = (Student) q.uniqueResult();
//       since we get an object
       List<Object []> students = (List<Object[]>) q.list();
       
       // once we get lists 
//       System.out.println(student);
       
       for(Object[] student : students) {
    	   System.out.println(student[0] + " " + student[1] + " " + student[2]);
       }
       
//       for(Object o : student) {
//    	   System.out.println(o);
//       }
//       
       
      
       session1.getTransaction().commit();
      
       
       
//       session1.close();
       
//       session 2 
//       Session session2 = sf.openSession();
//       session2.beginTransaction();  
////       a = (Alien) session2.get(Alien.class, 101);
//       Query q2 = session2.createQuery("from Alien where aid=101");
//       q2.setCacheable(true);
//       a = (Alien) q2.uniqueResult();
//       System.out.println(a);
//       
//       session2.getTransaction().commit();
//       session2.close();
       
       
    
       
       
       
// to fetch the data from hibernate
       
//       telusko = session.get(Alien.class, 103);
       
//       System.out.println(telusko);
       
       
    }

}
