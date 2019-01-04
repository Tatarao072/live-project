package org.jsp.app.Model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateHiberCls
{
	public static void HibernateCode(String firstName, String lastName, String mailId, String password, String conformPassword,
			String mobileNumber, String dateOfBirth, String gender, String address, String conditionAccept)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Registration rg=new Registration(firstName,lastName,mailId,password,conformPassword,
				mobileNumber,dateOfBirth,gender,address,conditionAccept);
		String hql_qry1="update Registration set firstName=? where mailId=:?";
		Query que1=ss.createQuery(hql_qry1);
		que1.setString(0,firstName);
		
		String hql_qry2="update Registration set mobileNumber=? where mailId=:?";
		Query que2=ss.createQuery(hql_qry2);
		que2.setString(0,mobileNumber);
		
		String hql_qry3="update Registration set mailId=? where mailId=?";
		Query que3=ss.createQuery(hql_qry3);
		que3.setString( 0, mailId);
		
		String hql_qry4="update Registration set address=? where mailId=?";
		Query que4=ss.createQuery(hql_qry4);
		que4.setString(0,address);
		que1.executeUpdate();
		que2.executeUpdate();
		que3.executeUpdate();
		que4.executeUpdate();
		tr.commit();
		ss.close();
	}
}
