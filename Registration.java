package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registration 
{
private String firstName;
private String lastName;
@Id
private String mailId;
private String password;
private String conformPassword;
private String mobileNumber;
private String dateOfBirth;
private String gender;
private String address;
private String conditionAccept;

public Registration() 
{
	super();
}
public Registration(String firstName, String lastName, String mailId, String password, String conformPassword,
		String mobileNumber, String dateOfBirth, String gender, String address, String conditionAccept) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mailId = mailId;
	this.password = password;
	this.conformPassword = conformPassword;
	this.mobileNumber = mobileNumber;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.address = address;
	this.conditionAccept = conditionAccept;
}
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
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConformPassword() {
	return conformPassword;
}
public void setConformPassword(String conformPassword) {
	this.conformPassword = conformPassword;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getConditionAccept() {
	return conditionAccept;
}
public void setConditionAccept(String conditionAccept) {
	this.conditionAccept = conditionAccept;
}
@Override
public String toString() {
	return "Registration [firstName=" + firstName + ", lastName=" + lastName + ", mailId=" + mailId + ", password="
			+ password + ", conformPassword=" + conformPassword + ", mobileNumber=" + mobileNumber + ", dateOfBirth="
			+ dateOfBirth + ", gender=" + gender + ", address=" + address + ", conditionAccept=" + conditionAccept
			+ "]";
}

}
