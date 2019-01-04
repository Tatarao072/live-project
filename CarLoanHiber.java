package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarLoanHiber 
{
public static void CarLoan(String fullName, String mobileNumber, String residancePinCode, String age, String makeModelOfCar,
			String showRoomPrice, String maritalStatus, String occupationType, String companyName, String panId,
			String monthlySalaryInhand)
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	CarLoanPojo clp=new CarLoanPojo(fullName, mobileNumber, residancePinCode, age, makeModelOfCar, showRoomPrice,
			                             maritalStatus, occupationType, companyName, panId, monthlySalaryInhand);
	ss.save(clp);
	tr.commit();
	ss.close();
}
}
