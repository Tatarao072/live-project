package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class educationLoanPojo 
{
private String firstName;
private String lastName;
@Id
private String mobileNum;
private String email;
private String age;
private String maritalStatus;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMobileNum() {
	return mobileNum;
}
public void setMobileNum(String mobileNum) {
	this.mobileNum = mobileNum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public educationLoanPojo(String firstName, String lastName, String mobileNum, String email, String age,
		String maritalStatus) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNum = mobileNum;
	this.email = email;
	this.age = age;
	this.maritalStatus = maritalStatus;
}
public educationLoanPojo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "educationLoanPojo [firstName=" + firstName + ", lastName=" + lastName + ", mobileNum=" + mobileNum
			+ ", email=" + email + ", age=" + age + ", maritalStatus=" + maritalStatus + "]";
}

}
