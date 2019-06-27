package com.UserFront.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="userId" , nullable = false , updatable = false)
	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
@Column(name="email" , nullable = false , unique = true)
	private String email;
	private String phone;
	
@OneToOne	
	private PrimaryAccount primaryaccount;
@OneToOne
	private SavingsAccount savingaccount;
@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
@JsonIgnore
	private List<Appointment> appointmentList;
@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Recipient> recipientList;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public PrimaryAccount getPrimaryaccount() {
		return primaryaccount;
	}
	public void setPrimaryaccount(PrimaryAccount primaryaccount) {
		this.primaryaccount = primaryaccount;
	}
	public SavingsAccount getSavingaccount() {
		return savingaccount;
	}
	public void setSavingaccount(SavingsAccount savingaccount) {
		this.savingaccount = savingaccount;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	public List<Recipient> getRecipientList() {
		return recipientList;
	}
	public void setRecipientList(List<Recipient> recipientList) {
		this.recipientList = recipientList;
	}
	

	
	
}
