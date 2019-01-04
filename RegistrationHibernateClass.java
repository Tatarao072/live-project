package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegistrationHibernateClass 
{
public static void HibernateCode(String FirstName,String LastName,String MailId,String Password,String ConformPassword, String MobileNumber,
		String DateOfBirth, String Gender,String Address,String ConditionAccept)
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	Registration rg=new Registration(FirstName,LastName,MailId,Password,ConformPassword,
			                         MobileNumber,DateOfBirth,Gender,Address,ConditionAccept);
	ss.save(rg);
	tr.commit();
	ss.close();
}
}
