package com.UserFront.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.UserFront.domain.security.Authority;
import com.UserFront.domain.security.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements UserDetails {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="user_id" , nullable = false , updatable = false)
	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
@Column(name="email" , nullable = false , unique = true)
	private String email;
	private String phone;
	
	private boolean enabled=true;
	
@OneToOne	
	private PrimaryAccount primaryaccount;
@OneToOne
	private SavingsAccount savingaccount;
@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
@JsonIgnore
	private List<Appointment> appointmentList;
@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Recipient> recipientList;

@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JsonIgnore
private Set<UserRole> userRoles = new HashSet<>();

public Set<UserRole> getUserRoles() {
    return userRoles;
}

public void setUserRoles(Set<UserRole> userRoles) {
    this.userRoles = userRoles;
}

	public Long getUserId() {
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
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<>();
        userRoles.forEach(ur -> authorities.add(new Authority(ur.getRole().getName())));
        return authorities;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}
	
	
	

	
	
}
