package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalLoanPojo 
{
private String fullName;
@Id
private String mobileNumber;
private String residancePinCode;
private String age;
private String maritalStatus;
private String occupationType;
private String companyName;
private String panId;
private String monthlySalaryInhand;
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getResidancePinCode() {
	return residancePinCode;
}
public void setResidancePinCode(String residancePinCode) {
	this.residancePinCode = residancePinCode;
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
public String getOccupationType() {
	return occupationType;
}
public void setOccupationType(String occupationType) {
	this.occupationType = occupationType;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getPanId() {
	return panId;
}
public void setPanId(String panId) {
	this.panId = panId;
}
public String getMonthlySalaryInhand() {
	return monthlySalaryInhand;
}
public void setMonthlySalaryInhand(String monthlySalaryInhand) {
	this.monthlySalaryInhand = monthlySalaryInhand;
}
public PersonalLoanPojo(String fullName, String mobileNumber, String residancePinCode, String age, String maritalStatus,
		String occupationType, String companyName, String panId, String monthlySalaryInhand) {
	super();
	this.fullName = fullName;
	this.mobileNumber = mobileNumber;
	this.residancePinCode = residancePinCode;
	this.age = age;
	this.maritalStatus = maritalStatus;
	this.occupationType = occupationType;
	this.companyName = companyName;
	this.panId = panId;
	this.monthlySalaryInhand = monthlySalaryInhand;
}
public PersonalLoanPojo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PersonalLoanPojo [fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", residancePinCode="
			+ residancePinCode + ", age=" + age + ", maritalStatus=" + maritalStatus + ", occupationType="
			+ occupationType + ", companyName=" + companyName + ", panId=" + panId + ", monthlySalaryInhand="
			+ monthlySalaryInhand + "]";
}

}
