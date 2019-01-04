package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CardApplyhiberClass 
{
 public static void HibernateCode(String fullName, String mobileNum, String email, String pinCode, String employementType,
			String companyName, String monthlySalary, String selectedCard)
 {
	 Configuration con=new Configuration();
	 con.configure("hibernate.xml");
	 SessionFactory sf=con.buildSessionFactory();
	 Session ss=sf.openSession();
	 Transaction tr=ss.beginTransaction();
	 
	 CardMemInformation cmi=new CardMemInformation(fullName,mobileNum,email,pinCode,employementType,companyName,monthlySalary,selectedCard);
	 ss.save(cmi);
	 tr.commit();
	 ss.close();
	 
 }
}
