package org.jsp.app.Model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ForgotpaswordHiber 
{
public static boolean hiberForgot(String emailId,String password, String conformPassword)
{
	Configuration conf=new Configuration();
	conf.configure("hibernate.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	String query="update Registration set password=:psw,conformPassword=:cpsw where mailId=:em";
	Query que=ss.createQuery(query);
	que.setString("em", emailId);
	que.setString("psw",password);
	que.setString("cpsw",conformPassword);
	int res=que.executeUpdate();
	tr.commit();
	if(res==1)
	{
		return true;
	}
	ss.close();
	
	return false;
	
}
}
