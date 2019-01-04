package org.jsp.app.Model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoanCheckHiberCls 
{

	public static List<PersonalLoanPojo> HibernateCode1(String mobileNumber)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
	    
		String query="from PersonalLoanPojo where mobileNumber=?";
		
		Query que=ss.createQuery(query);
		que.setString(0,mobileNumber);
		List<PersonalLoanPojo> li=que.list();
		tr.commit();
		ss.close();
		if((li==null) || (li.isEmpty()))
		{
			return null;
		}
		
		return li;
	}
	public static List<CarLoanPojo> HibernateCode2(String mobileNumber)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
	    
		String query="from CarLoanPojo where mobileNumber=?";
		
		Query que=ss.createQuery(query);
		que.setString(0,mobileNumber);
		List<CarLoanPojo> li=que.list();
		tr.commit();
		ss.close();
		if((li==null) || (li.isEmpty()))
		{
			return null;
		}
		
		return li;
	}
	public static List<educationLoanPojo> HibernateCode3(String mobileNumber)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
	    
		String query="from educationLoanPojo where mobileNumber=?";
		
		Query que=ss.createQuery(query);
		que.setString(0,mobileNumber);
		List<educationLoanPojo> li=que.list();
		tr.commit();
		ss.close();
		if((li==null) || (li.isEmpty()))
		{
			return null;
		}
		
		return li;
	}
}
