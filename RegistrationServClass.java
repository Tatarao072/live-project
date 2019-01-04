package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.RegistrationHibernateClass;
@WebServlet(urlPatterns="/view/regs")
public class RegistrationServClass extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
		String FirstName=req.getParameter("fname");
		String LastName=req.getParameter("lname");
		String MailId=req.getParameter("email");
		String Password=req.getParameter("password");
		String ConformPassword=req.getParameter("cpassword");
		String MobileNumber=req.getParameter("number");
		String DateOfBirth=req.getParameter("trip-start");
		String Gender=req.getParameter("gender");
		String Address=req.getParameter("address");
		String ConditionAccept=req.getParameter("con");
	    PrintWriter pw=resp.getWriter();
	    pw.println("<html><body><h2>Welcome to J S P* Bank    "+FirstName+"</h2></body></html>");
	    RegistrationHibernateClass.HibernateCode(FirstName,LastName,MailId,Password,ConformPassword,
                                                 MobileNumber,DateOfBirth,Gender,Address,ConditionAccept);
	}

}
