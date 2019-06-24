package com.UserFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {

	private Long id;
	private int accountNumber;
	private BigDecimal accountbalance;
	
	private List<SavingTransaction> savingsTransactionList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(BigDecimal accountbalance) {
		this.accountbalance = accountbalance;
	}

	public List<SavingTransaction> getSavingsTransactionList() {
		return savingsTransactionList;
	}

	public void setSavingsTransactionList(List<SavingTransaction> savingsTransactionList) {
		this.savingsTransactionList = savingsTransactionList;
	}
	
	
}
