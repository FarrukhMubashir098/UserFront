package com.UserFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {

	private Long id;
	private int accountNumber;
	private BigDecimal accountbalance;
	
	private List<PrimaryTransaction> primaryTransactionList;

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

	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}
	
	
	
}
