package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GeneratePinHiberCls 
{
public static void HibernateCode(String aTMcardNumber, String expiryDate, String enterPin)
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	
	GeneratePinPojo gpp=new GeneratePinPojo(aTMcardNumber, expiryDate, enterPin);
    ss.save(gpp);
    tr.commit();
    ss.close();
}
}
