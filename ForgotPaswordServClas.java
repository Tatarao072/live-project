package org.jsp.app.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Services.ForgotPassword;
@WebServlet(urlPatterns="/view/forgotPassword")
public class ForgotPaswordServClas extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{
	RequestDispatcher rd=null;
	String emailId=req.getParameter("username");
	String password=req.getParameter("New Password");
	String conformPassword=req.getParameter("Conform Password");
	boolean b1=ForgotPassword.validatePassword(emailId,password,conformPassword);
	{
		if(b1==true)
		{
			rd=req.getRequestDispatcher("ForgotSuccess.html");
			rd.include(req, resp);
		}
		else
		{
			rd=req.getRequestDispatcher("ForgotPasswordUnsuccess.html");
			rd.include(req, resp);
		}
	}
	
}
}
