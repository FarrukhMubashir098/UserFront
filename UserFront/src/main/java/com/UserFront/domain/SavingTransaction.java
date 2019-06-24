package com.UserFront.domain;

import java.math.BigDecimal;
import java.util.Date;

public class SavingTransaction {

	private Long id;
	private Date date;
	private String description;
	private String type;
	private String status;
	private double amount;
	private BigDecimal availableBalance;
	private PrimaryAccount savingAccount;
	public SavingTransaction(Date date, String description, String type, String status, double amount,
			BigDecimal availableBalance, PrimaryAccount savingAccount) {
		super();
		this.date = date;
		this.description = description;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.savingAccount = savingAccount;
	}
	public SavingTransaction() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}
	public PrimaryAccount getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(PrimaryAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	
	
	
}
