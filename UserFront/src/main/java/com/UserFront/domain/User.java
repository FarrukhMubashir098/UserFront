package com.UserFront.domain;

import java.util.List;

public class User {

	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private PrimaryAccount primaryaccount;
	private SavingsAccount savingaccount;
	private List<Appointment> appointmentList;
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
