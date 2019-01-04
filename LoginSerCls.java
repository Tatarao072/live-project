package org.jsp.app.Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.LoginHiberCls;
import org.jsp.app.Model.Registration;

@WebServlet(urlPatterns="/view/log")
public class LoginSerCls extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		
		RequestDispatcher rd=null;
		String mailId=req.getParameter("username");
		String password=req.getParameter("password");
		
		List<Registration> b1=LoginHiberCls.HibernateCode(mailId,password);
		PrintWriter pw=resp.getWriter();
		if(b1!=null)
		{
			String FirstName=b1.get(0).getFirstName();
			
			ServletContext s1=getServletContext();
			s1.setAttribute("fullName",FirstName);
			
			String MailId=b1.get(0).getMailId();
			s1.setAttribute("mailId", MailId);
			String MobileNumber=b1.get(0).getMobileNumber();
			s1.setAttribute("mobileNumber", MobileNumber);
			String DateOfBirth=b1.get(0).getDateOfBirth();
            s1.setAttribute("dateOfBirth", DateOfBirth);			
			String Gender=b1.get(0).getGender();
			s1.setAttribute("gender", Gender);
			String Address=b1.get(0).getAddress();
			s1.setAttribute("address", Address);
			
			rd=req.getRequestDispatcher("LoginSuccess.jsp");
			rd.include(req,resp);
		}
		else
		{
			pw.println("<html><body><h1>please enter correct userName or Password</h1></body></html>");
		}
	}

}
