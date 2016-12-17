package com.hibernate.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.data.entities.Address;
import com.hibernate.data.entities.Bank;
import com.hibernate.data.entities.TimeTest;
import com.hibernate.data.entities.User;

public class Application {
	
public static void main(String[] args) {
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setFirstName("nazar");
		user.setLastName("mubeen");
		user.setBirthDate(new Date());
		user.setCreatedBy("jkiop");
		user.setCreatedDate(new Date());
		user.setEmailAddress("kmdklah85@yahoo.com");
		user.setLastUpdatedBy("poiok");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		session.getTransaction().commit();
		session.beginTransaction();
		user=(User)session.get(User.class,user.getUserId());
		user.setEmailAddress("muemail@gmail.com");
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		*/
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	try {
		//session.getTransaction().begin();
/*
		TimeTest test = new TimeTest(new Date());
		session.save(test);
		session.getTransaction().commit();
		
		session.refresh(test);
		
		System.out.println(test.toString());
	
		
		User user = new User();
		Address address = new Address();
		user.setAge(22);
		user.setBirthDate(new Date());
		user.setCreatedBy("Kevin");
		user.setCreatedDate(new Date());
		user.setEmailAddress("kmb3");
		user.setFirstName("kevin");
		user.setLastName("bowersox");
		user.setLastUpdatedBy("kmb");
		user.setLastUpdatedDate(new Date());
		
		address.setAddressLine1("line 1");
		address.setAddressLine2("line2");
		address.setCity("Philadelphia");
		address.setState("PA");
		address.setZipCode("12345");
		
		user.setAddress(address);
		session.save(user);
		
		session.getTransaction().commit();
			*/
		

		Transaction transaction = session.beginTransaction();
		
		Bank bank = new Bank();
		bank.setName("Federal Trust");
		bank.setAddressLine1("33 Wall Street");
		bank.setAddressLine2("Suite 233");
		bank.setCity("New York");
		bank.setState("NY");
		bank.setZipCode("12345");
		bank.setInternational(false);
		bank.setCreatedBy("Kevin");
		bank.setCreatedDate(new Date());
		bank.setLastUpdatedBy("Kevin");
		bank.setLastUpdatedDate(new Date());
		bank.getContacts().add("Joe");
		bank.getContacts().add("Mary");			
		session.save(bank);
		
		transaction.commit();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		session.close();
		HibernateUtil.getSessionFactory().close();
	}
	}
}
