package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeneratePinPojo 
{
	@Id
private String ATMcardNumber;
private String expiryDate;
private String enterPin;
public String getATMcardNumber() {
	return ATMcardNumber;
}
public void setATMcardNumber(String aTMcardNumber) {
	ATMcardNumber = aTMcardNumber;
}
public String getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}
public String getEnterPin() {
	return enterPin;
}
public void setEnterPin(String enterPin) {
	this.enterPin = enterPin;
}
public GeneratePinPojo(String aTMcardNumber, String expiryDate, String enterPin) {
	super();
	ATMcardNumber = aTMcardNumber;
	this.expiryDate = expiryDate;
	this.enterPin = enterPin;
}
public GeneratePinPojo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "GeneratePinPojo [ATMcardNumber=" + ATMcardNumber + ", expiryDate=" + expiryDate + ", enterPin=" + enterPin
			+ "]";
}

}
