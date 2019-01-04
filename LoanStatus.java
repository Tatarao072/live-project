package org.jsp.app.Services;

import java.util.List;

import org.jsp.app.Model.CarLoanPojo;
import org.jsp.app.Model.LoanCheckHiberCls;
import org.jsp.app.Model.PersonalLoanPojo;
import org.jsp.app.Model.educationLoanPojo;

public class LoanStatus 
{
public static List<PersonalLoanPojo> service1(String mobileNumber)
{
	List<PersonalLoanPojo> li=null;
	if(mobileNumber.length()==10)
	{
		li=LoanCheckHiberCls.HibernateCode1(mobileNumber);
	}
	if(li==null)
	{
		return null;
	}
	return li;
}
public static List<CarLoanPojo> service2(String mobileNumber)
{
	List<CarLoanPojo> li=null;
	if(mobileNumber.length()==10)
	{
		li=LoanCheckHiberCls.HibernateCode2(mobileNumber);
	}
	if(li==null)
	{
		return null;
	}
	return li;
}
public static List<educationLoanPojo> service3(String mobileNumber)
{
	List<educationLoanPojo> li=null;
	if(mobileNumber.length()==10)
	{
		li=LoanCheckHiberCls.HibernateCode3(mobileNumber);
	}
	if(li==null)
	{
		return null;
	}
	return li;
}
}