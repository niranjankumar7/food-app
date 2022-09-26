package foodApp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class branch {
	@Id
	private int id;
	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	
	public branch() {
		
	}
	
	public branch(int id, String name, String address, int phoneNumber, String email) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
