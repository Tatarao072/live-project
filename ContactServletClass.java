package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.ContactHibernate;
@WebServlet(urlPatterns="/view/contact")
public class ContactServletClass extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{
  String fullName=req.getParameter("fname");
  String email=req.getParameter("email");
  String mobileNumber=req.getParameter("num");
  String question=req.getParameter("address");
  PrintWriter pw=resp.getWriter();
  pw.println("<html><body><h2>Thank You for contacting us over hr will contact you soon->    "+fullName+"</h2></body></html>");
  ContactHibernate.Contact(fullName, email, mobileNumber, question);
}
}
