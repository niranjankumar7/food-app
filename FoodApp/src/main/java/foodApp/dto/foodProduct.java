package foodApp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class foodProduct {
	@Id
	private int id;
	private String name;
	private String type;
	private String about;
	private boolean available;
	private float price;
	
	public foodProduct() {
		
	}
	
	public foodProduct(int id, String name,String type, String about, boolean available,float price) {
		this.id = id;
		this.name=name;
		this.type = type;
		this.about = about;
		this.available = available;
		this.price = price;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
