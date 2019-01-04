package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.PersonalLoanHiber;
@WebServlet(urlPatterns="/view/personalLoan")
public class PersonalLoanServCls extends HttpServlet
{
	static int otp;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	String fullName=req.getParameter("fname");
	String mobileNumber=req.getParameter("number");
	String residancePinCode=req.getParameter("pin");
	String age=req.getParameter("age");
	String maritalStatus=req.getParameter("Marital status");
	String occupationType=req.getParameter("Occupation Type");
	String companyName=req.getParameter("cname");
	String panId=req.getParameter("pan");
	String monthlySalaryInhand=req.getParameter("sal");
	Random rm=new Random();
    otp=rm.nextInt(10000000);
   if(otp<0)
    {
	otp=otp*-1;
    }
	PrintWriter pw=resp.getWriter();
	int msi=Integer.parseInt(monthlySalaryInhand);
	if(msi>35000)
	{
	pw.println("<html><body><h2>you are eligible for this loan---->"+fullName+"</h2></body></html>");
	pw.println("<html><body><h2>your loan is applied, for further details use this referance number"+otp+"</h2></body></html>");
	
	}
	else
	{
    pw.println("<html><body><h2>you are not eligible for this loan</h2></body></html>");	
	}
	PersonalLoanHiber.HibernateCode(fullName, mobileNumber, residancePinCode, age, maritalStatus, occupationType, companyName, panId, monthlySalaryInhand);
}
}
