package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EducationLoanHiberCls
{
public static void HibernateCode(String firstName, String lastName, String mobileNum, String email, String age,
		String maritalStatus)
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	educationLoanPojo elp=new educationLoanPojo(firstName, lastName, mobileNum, email, age, maritalStatus);
	ss.save(elp);
	tr.commit();
	ss.close();

}
}
