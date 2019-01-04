package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.AccountNumHiber;
@WebServlet(urlPatterns="/view/accountNum")
public class AccountNumSevClas extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{
	String holderName=req.getParameter("hName");
	String accountNumber=req.getParameter("AccNum");
	String accountType=req.getParameter("Account type");
	PrintWriter pw=resp.getWriter();
	int accountNumber1=Integer.parseInt(accountNumber);
	pw.println("<html><body><h2>Your Account Number is   "+accountNumber+"</h2></body></html>");
	AccountNumHiber.AccNum(holderName,accountNumber1,accountType);
}
}
