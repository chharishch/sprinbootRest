package SpringbootSample.Customer;

public class Order {

	private String order_id;
	private String order_name;
	private String order_iteam;
	private String order_status;
	
	public Order(){
	}
	
	
	public Order(String order_id, String order_name, String order_iteam, String order_status) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.order_iteam = order_iteam;
		this.order_status = order_status;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getOrder_iteam() {
		return order_iteam;
	}
	public void setOrder_iteam(String order_iteam) {
		this.order_iteam = order_iteam;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	
	}


