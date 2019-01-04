package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.CarLoanPojo;
import org.jsp.app.Model.LoanCheckHiberCls;
import org.jsp.app.Model.LoginHiberCls;
import org.jsp.app.Model.PersonalLoanPojo;
import org.jsp.app.Model.Registration;
import org.jsp.app.Model.educationLoanPojo;
@WebServlet(urlPatterns="/view/status")
public class LoanCheckServCls extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{

	String mobileNumber=req.getParameter("ref");
	
	List<PersonalLoanPojo> b1=LoanCheckHiberCls.HibernateCode1(mobileNumber);
	List<CarLoanPojo> b2=LoanCheckHiberCls.HibernateCode2(mobileNumber);
	List<educationLoanPojo> b3=LoanCheckHiberCls.HibernateCode3(mobileNumber);
	PrintWriter pw=resp.getWriter();
	if(b1!=null)
	{
		pw.println("<html><body><h1>Your loan is under processing</h1></body></html>");
	}
	else if (b2!=null) 
	{
		pw.println("<html><body><h1>Your loan is under processing</h1></body></html>");	
	}
	else if (b3!=null) 
	{
		pw.println("<html><body><h1>Your loan is under processing</h1></body></html>");	
	}
	else 
	{
		pw.println("<html><body><h1>please enter correct mobile number</h1></body></html>");
	}
}
}
