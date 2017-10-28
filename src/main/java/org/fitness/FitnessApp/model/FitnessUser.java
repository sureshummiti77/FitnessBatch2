package org.fitness.FitnessApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class FitnessUser 
{
	
	@Id
	@GeneratedValue
	private int userId;
	
	private String userType;
	
	private String location;
	
	private String password;
	
	private String phoneNumber;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "FitnessUser [userId=" + userId + ", userType=" + userType + ", location=" + location + ", password="
				+ password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
	
	
}
