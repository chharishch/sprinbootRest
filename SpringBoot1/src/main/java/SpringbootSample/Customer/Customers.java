package SpringbootSample.Customer;

public class Customers {
	
	
	private String Customer_id;
	private String Customer_name;
	private String order;
	private String Password;
	
	
	

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Customers() {
		
	}
	
	public Customers(String customer_id, String customer_name, String order, String password) {
		super();
		Customer_id = customer_id;
		Customer_name = customer_name;
		this.order = order;
		Password=password;
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
