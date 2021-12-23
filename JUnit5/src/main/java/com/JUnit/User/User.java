package com.JUnit.User;

public class User {
	
	private int age;
	private String FirstName;
	private String SecondName;
	
	public User(int age, String firstName, String secondName) {
		super();
		this.age = age;
		FirstName = firstName;
		SecondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	
	

}
