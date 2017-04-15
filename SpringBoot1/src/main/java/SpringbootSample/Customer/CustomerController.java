package SpringbootSample.Customer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;

	@RequestMapping("/customers/{id}")
	public String getCustomers(@PathVariable String id){
		return customerService.getCustomers(id);

	}
	@RequestMapping("/customer/{id}/{pswd}")
	public String validateCustomer(@PathVariable String id,@PathVariable String pswd){
		return customerService.validateCustomer(id, pswd);

	}
	@RequestMapping("/customers")
	public List<Customers> getAllCustomers(){
		return customerService.getAllCustomers(); 
		
	}
	@RequestMapping("/orders")
	public List<Order> getAllOrder(){
		return orderService.getAllOrder(); 
	}
	@RequestMapping("/orders/{id}")
	public  String getOrder(@PathVariable String id) {
		// TODO Auto-generated method stub
		return orderService.getOrder(id);
	}
}
