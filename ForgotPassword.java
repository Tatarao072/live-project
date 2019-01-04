package org.jsp.app.Services;

import org.jsp.app.Model.ForgotpaswordHiber;

public class ForgotPassword 
{
public static boolean validatePassword(String emailId,String password, String conformPassword)
{
	String num="";
	boolean status=false;
	int count=0;
	for(int i=0;i<=password.length()-1;i++)
	{
		char ch=password.charAt(i);
		if(ch!='@' && ch!='#' && ch!='$' && ch!='_')
		{
			num=num+ch;
			count++;
		}
		if(count==num.length())
		{
			status=ForgotpaswordHiber.hiberForgot(emailId,password,conformPassword);
		}
	}
	
	return status;
	
}
}
