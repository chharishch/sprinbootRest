package SpringbootSample.Customer;

public class Customers {
	
	
	private String Customer_id;
	private String Customer_name;
	private String order;
	
	
	public Customers() {
		
	}
	
	public Customers(String customer_id, String customer_name, String order) {
		super();
		Customer_id = customer_id;
		Customer_name = customer_name;
		this.order = order;
	}
	public String getId(){
		return Customer_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getorder() {
		return order;
	}
	public void setorder(String order) {
		this.order = order;
	}

}
