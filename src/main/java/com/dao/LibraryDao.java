package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.LibraryHome;

public class LibraryDao { 
	
	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(LibraryHome.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		LibraryHome lh = new LibraryHome();
		lh.setFullName("Ra.One");
		lh.setEmail("KillLucifer@gmail.com");
		lh.setDepartment("CS/IT");
		lh.setCourse("Masters of Technology(M.Tech)");
		lh.setYearOfStudy(5);
		lh.setPhone("433434111");
		lh.setAddress("INDIA");
		lh.setMembershipDate("11 JUNE 2011");
		lh.setActiveMember(true);

		ss.persist(lh);
//		ss.save(lh);

		tr.commit(); // change should be permanent
		ss.close();

		System.out.println("Data is inserted..");
	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LibraryHome.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int readerId = 6;

		LibraryHome lh = ss.get(LibraryHome.class, readerId);
		lh.setDepartment("Science & Research");
		lh.setPhone("23411233");

		ss.merge(lh);
//		ss.update(lh);  // deprecated method *****

		tr.commit();
		ss.close();

		System.out.println("Data is Updated");
	}
 
	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LibraryHome.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// --------- delete from LibraryHome where id=2; ----------

		int readerId = 4; // id you want to delete (primary key)

		LibraryHome lh = ss.get(LibraryHome.class, readerId);

//		ss.delete(lh); // deprecated method *****
		ss.remove(lh);

		System.out.println("Data is deleted");

		// ---------- Fetch data from LibraryHome -------------

//		int readerId=2;  // id data you want to fetch (primary key)
//		LibraryHome lh= ss.get(LibraryHome.class, readerId);
//		System.out.println(lh);

		tr.commit();
		ss.close();

	}
}
