package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/view/pinGeneration")
public class GeneratePinServCls extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException
{
	String ATMcardNumber=req.getParameter("CardNumber1");
	String expiryDate=req.getParameter("expiry");
	String enterPin=req.getParameter("CardPin1");
	PrintWriter pw=resp.getWriter();
	pw.println("<html><body><h2>Your pin is generated successfully, don't tell to anyone this pin</h2></body></html>");
	
}
}
