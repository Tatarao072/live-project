package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.EducationLoanHiberCls;
@WebServlet(urlPatterns="/view/educationLoan")
public class EducationLoanSevlCls extends HttpServlet
{
	static int ref;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	String firstName=req.getParameter("fname");
	String lastName=req.getParameter("lname");
	String mobileNum=req.getParameter("number");
	String email=req.getParameter("email");
	String age=req.getParameter("age");
	String maritalStatus=req.getParameter("Marital status");
	Random rm=new Random();
    ref=rm.nextInt(10000000);
   if(ref<0)
    {
	ref=ref*-1;
    }
	PrintWriter pw=resp.getWriter();
	int ag=Integer.parseInt(age);
	if(ag>=18)
	{
	pw.println("<html><body><h2>you are eligible for this loan---->"+firstName+"</h2></body></html>");
	pw.println("<html><body><h2>your loan is applied, for further details use this referance number"+ref+"</h2></body></html>");
	
	}
	else
	{
    pw.println("<html><body><h2>you are not eligible for this loan</h2></body></html>");	
	}
	EducationLoanHiberCls.HibernateCode(firstName, lastName, mobileNum, email, age, maritalStatus);
}
}
