package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonalLoanHiber 
{
public static void HibernateCode(String fullName, String mobileNumber, String residancePinCode, String age, String maritalStatus,
		String occupationType, String companyName, String panId, String monthlySalaryInhand)
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	PersonalLoanPojo plp=new PersonalLoanPojo(fullName, mobileNumber, residancePinCode, age, maritalStatus, occupationType, companyName, panId, monthlySalaryInhand);
	ss.save(plp);
	tr.commit();
	ss.close();
}
}
