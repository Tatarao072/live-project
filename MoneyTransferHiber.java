package org.jsp.app.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MoneyTransferHiber 
{
public static void HibernateCode(String holderName, String bank, String iFSCCode, String branchName, String accountNumber,
		String accountType, String amount)
{
	Configuration con=new Configuration();
	con.configure("hibernate.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	MoneyTransferPojo mtp=new MoneyTransferPojo(holderName, bank, iFSCCode, branchName, accountNumber, accountType, amount);
	ss.save(mtp);
	tr.commit();
	ss.close();
}
}
