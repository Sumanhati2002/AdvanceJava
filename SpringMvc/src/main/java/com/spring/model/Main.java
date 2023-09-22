package com.spring.model;

import java.util.List;

public class Main {

	private String name;
	private String email;
	private int password;
	private List<String> courses;
	private String fav_language;
	
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getFav_language() {
		return fav_language;
	}
	public void setFav_language(String fav_language) {
		this.fav_language = fav_language;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Main [name=" + name + ", email=" + email + ", password=" + password + ", courses=" + courses
				+ ", fav_language=" + fav_language + ", address=" + address + "]";
	}
	
}
