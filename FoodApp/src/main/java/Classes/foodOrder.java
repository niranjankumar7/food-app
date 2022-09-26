package Classes;

public class foodOrder {
	int id;
	String status;
	float totalPrice;
	int orderCreatedTime;
	int orderDeliveryTime;
	String customerName;
	int contactNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getOrderCreatedTime() {
		return orderCreatedTime;
	}
	public void setOrderCreatedTime(int orderCreatedTime) {
		this.orderCreatedTime = orderCreatedTime;
	}
	public int getOrderDeliveryTime() {
		return orderDeliveryTime;
	}
	public void setOrderDeliveryTime(int orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
}
