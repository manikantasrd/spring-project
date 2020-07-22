package com.springboot.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="User_Name", length=50, nullable=false, unique=true)
	private String username;

	@Column(name="First_Name", length=50, nullable=false)
	private String firstname;
	
	@Column(name="Last_Name", length=50, nullable=false)
	private String lastname;
	
	@Column(name="Email_ID", length=50, nullable=false)
	private String email;
	
	@Column(name="Role", length=50, nullable=false)
	private String role;
	
	@Column(name="SSN", length=50, nullable=false, unique=true)
	private String ssn;
	
	//No argument constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Fields constructor
	public Student(Long id, String username, String firstname, String lastname, String email, String role, String ssn) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	//Getters and Setters
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public String getRole() {
		return role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//To string method
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	
}
