package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountNumPojo 
{
private String holderName;
@Id
private int accountNumber;
private String accountType;
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
@Override
public String toString() {
	return "AccountNumPojo [holderName=" + holderName + ", accountNumber=" + accountNumber + ", accountType="
			+ accountType + "]";
}
public AccountNumPojo(String holderName, int accountNumber, String accountType) {
	super();
	this.holderName = holderName;
	this.accountNumber = accountNumber;
	this.accountType = accountType;
}
public AccountNumPojo() {
	super();
	// TODO Auto-generated constructor stub
}

}