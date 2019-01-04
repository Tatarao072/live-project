package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.MoneyTransferHiber;
@WebServlet(urlPatterns="/view/moneyTransfer")
public class MoneyTransferSercls extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{
	String holderName=req.getParameter("bname");
	String bank=req.getParameter("Bank");
	String iFSCCode=req.getParameter("ifsc");
	String branchName=req.getParameter("branch");
	String accountNumber=req.getParameter("number");
	String accountType=req.getParameter("account type");
	String amount=req.getParameter("amt");
	PrintWriter pw=resp.getWriter();
	int am=Integer.parseInt(amount);
	if(am<=10000)
	{
		pw.println("<html><body><h2>"+amount+"Successfully transfer to "+holderName+"</h2></body></html>");
	}
	else
	{
		pw.println("<html><body><h2>at a time only <10000 rs possible</h2></body></html>");
	}
	MoneyTransferHiber.HibernateCode(holderName, bank, iFSCCode, branchName, accountNumber, accountType, amount);
}
}
