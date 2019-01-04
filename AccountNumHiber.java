package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountNumHiber 
{
public static void AccNum(String holderName, int accountNumber, String accountType)
{
	
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	AccountNumPojo anp=new AccountNumPojo(holderName,accountNumber,accountType);
	ss.save(anp);
	tr.commit();
	ss.close();
	
	
}
}
