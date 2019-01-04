package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.Model.RegistrationHibernateClass;
import org.jsp.app.Model.UpdateHiberCls;
@WebServlet(urlPatterns="/view/UpdateProfile")
public class UpdateInfoServCls extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
{
	String firstName=req.getParameter("fname");
	String mobileNumber=req.getParameter("number");
	String mailId=req.getParameter("email");
	String address=req.getParameter("address");
	PrintWriter pw=resp.getWriter();
    pw.println("<html><body><h2>Your information successfully updated</h2></body></html>");
    UpdateHiberCls.HibernateCode(firstName,mailId,
			mobileNumber,address, address, address, address, address, address, address);
}
}
