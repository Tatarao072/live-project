package org.jsp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MoneyTransferPojo 
{
private String holderName;
private String bank;
private String iFSCCode;
private String branchName;
@Id
private String accountNumber;
private String accountType;
private String amount;
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public String getiFSCCode() {
	return iFSCCode;
}
public void setiFSCCode(String iFSCCode) {
	this.iFSCCode = iFSCCode;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public MoneyTransferPojo(String holderName, String bank, String iFSCCode, String branchName, String accountNumber,
		String accountType, String amount) {
	super();
	this.holderName = holderName;
	this.bank = bank;
	this.iFSCCode = iFSCCode;
	this.branchName = branchName;
	this.accountNumber = accountNumber;
	this.accountType = accountType;
	this.amount = amount;
}
public MoneyTransferPojo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "MoneyTransferPojo [holderName=" + holderName + ", bank=" + bank + ", iFSCCode=" + iFSCCode + ", branchName="
			+ branchName + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", amount=" + amount
			+ "]";
}

}
