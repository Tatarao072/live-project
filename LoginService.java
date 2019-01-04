package org.jsp.app.Services;

import java.util.List;

import org.jsp.app.Model.LoginHiberCls;
import org.jsp.app.Model.Registration;

public class LoginService 
{
public static List<Registration> service(String mailId,String password)
{
	List<Registration> li=null;
	if(password.length()<=10)
	{
		li=LoginHiberCls.HibernateCode(mailId,password);
	}
	if(li==null)
	{
		return null;
	}
	return li;
}
}
