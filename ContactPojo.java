package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactPojo 
{
private String fullName;
@Id
private String email;
private String mobileNumber;
private String question;
public ContactPojo(String fullName, String email, String mobileNumber, String question)
{
	super();
	this.fullName = fullName;
	this.email = email;
	this.mobileNumber = mobileNumber;
	this.question = question;
}

public ContactPojo() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "ContactPojo [fullName=" + fullName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", question="
			+ question + "]";
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}


}
