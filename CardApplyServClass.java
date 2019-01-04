package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.jsp.app.Model.CardApplyhiberClass;
@WebServlet(urlPatterns="/view/card")
public class CardApplyServClass extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String fullName=req.getParameter("fname");
		String mobileNum=req.getParameter("number");
		String email=req.getParameter("email");
		String pinCode=req.getParameter("pin");
		String employementType=req.getParameter("EmployementType");
		String companyName=req.getParameter("cname");
		String monthlySalary=req.getParameter("sal");
		String selectedCard=req.getParameter("selectCard");
		PrintWriter pw=resp.getWriter();
	    int	mtsal=Integer.parseInt(monthlySalary);
	    CardApplyhiberClass.HibernateCode(fullName, mobileNum, email, pinCode, employementType, companyName, monthlySalary, selectedCard);
	    if(mtsal>=1000)
		{
		pw.println("<html><body>"+fullName+"<h2>thank you for your response you will get confirmation from us with in two days</h2></body></html>");
	    }
	    else 
	    {
	    pw.println("<html><body><h2>You Are Not eligible for applying this card</h2></body></html>");	
	    }
	}
	}
