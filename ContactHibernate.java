package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ContactHibernate 
{
public static boolean Contact(String fullName, String email, String mobileNumber, String question) 
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	ContactPojo cp=new ContactPojo(fullName, email, mobileNumber, question);
	ss.save(cp);
	tr.commit();
	ss.close();
	return false;
	
}
}
