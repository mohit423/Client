package com.comviva.client.model;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

//User Details Dto for Client Side
public class UserDetails {

	//variables initialization
	@NotNull
	@Column(name = "account", unique = true)
	private int account;
	@Column(name = "name")
	private String name;
	@Column(name = "dob")
	private String dob;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "password")
	private String password;
	@Column(name = "fathername")
	private String fathername;
	@Column(name = "mothername")
	private String mothername;
	@Column(name = "gender")
	private String gender;
	@Column(name = "adhaar")
	private String adhaar;
	@Column(name = "pan")
	private String pan;
	@Column(name = "bloodgroup")
	private String bloodgroup;
	@Column(name = "alternatenumber")
	private String alternatenumber;
	
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAlternatenumber() {
		return alternatenumber;
	}
	public void setAlternatenumber(String alternatenumber) {
		this.alternatenumber = alternatenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "UserDetails [account=" + account + ", name=" + name + ", dob=" + dob + ", email=" + email + ", phone="
				+ phone + ", password=" + password + ", fathername=" + fathername + ", mothername=" + mothername
				+ ", gender=" + gender + ", adhaar=" + adhaar + ", pan=" + pan + ", bloodgroup=" + bloodgroup
				+ ", alternatenumber=" + alternatenumber + "]";
	}
}
