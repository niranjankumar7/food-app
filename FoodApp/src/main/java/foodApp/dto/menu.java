package foodApp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "menu")
public class menu {
	@Id
	private int id;

	public menu() {
		
	}
	
	public menu(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
