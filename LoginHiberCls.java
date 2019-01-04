package org.jsp.app.Model;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import org.jsp.app.Model.Registration;
public class LoginHiberCls 
{
	public static List<Registration> HibernateCode(String mailId,String password)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
	    
		String query="from Registration where mailId=? and password=?";
		
		Query que=ss.createQuery(query);
		que.setString(0,mailId);
		que.setString(1,password);
		List<Registration> li=que.list();
		tr.commit();
		ss.close();
		if((li==null) || (li.isEmpty()))
		{
			return null;
		}
		
		return li;
	}
}
