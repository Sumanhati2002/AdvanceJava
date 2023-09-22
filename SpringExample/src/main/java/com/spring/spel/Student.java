package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{100+7}")
	private int id;
	
	@Value("suman")
	private String name;
	
	@Value("#{T(java.lang.Math).sqrt(25) }")
	private Double x;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", x=" + x + "]";
	}

	
	
}
