package com.hibernate.data;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.data.entities.User;

public class Application {
	
public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
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
		session.close();
	}
}
