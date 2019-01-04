package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardMemInformation 
{
private String fullName;
@Id
private String mobileNum;
private String email;
private String pinCode;
private String employementType;
private String companyName;
private String monthlySalary;
private String selectedCard;
public CardMemInformation(String fullName,String mobileNum,String email,String pinCode,String employementType,
		String companyName,String monthlySalary,String selectedCard) 
{
	super();
	this.fullName = fullName;
	this.mobileNum = mobileNum;
	this.email = email;
	this.pinCode = pinCode;
	this.employementType = employementType;
	this.companyName = companyName;
	this.monthlySalary = monthlySalary;
	this.selectedCard = selectedCard;
}
public CardMemInformation() 
{
	super();
}
public String getFirstName() {
	return fullName;
}
public void setFirstName(String firstName) {
	this.fullName = firstName;
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
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
public String getEmployementType() {
	return employementType;
}
public void setEmployementType(String employementType) {
	this.employementType = employementType;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getMonthlySalary() {
	return monthlySalary;
}
public void setMonthlySalary(String monthlySalary) {
	this.monthlySalary = monthlySalary;
}
public String getSelectedCard() {
	return selectedCard;
}
public void setSelectedCard(String selectedCard) {
	this.selectedCard = selectedCard;
}
@Override
public String toString() {
	return "CardMemInformation [fullName=" + fullName + ", mobileNum=" + mobileNum + ", email=" + email + ", pinCode="
			+ pinCode + ", employementType=" + employementType + ", companyName=" + companyName + ", monthlySalary="
			+ monthlySalary + ", selectedCard=" + selectedCard + "]";
}

}
