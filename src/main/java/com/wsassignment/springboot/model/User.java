  package com.wsassignment.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usertable")
public class User {
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;

@Column
private String firstname;
@Column
private String lastname;

private String email;

 public User() {}
   
public User( String firstname, String lastname, String email) {
	super(); 
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

 
}
