package com.UserFront.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SavingsAccount {


@Id
@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private int accountNumber;
	private BigDecimal accountbalance;

@OneToMany(mappedBy="savingAccount" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
@JsonIgnore
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
