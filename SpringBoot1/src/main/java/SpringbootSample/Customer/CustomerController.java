package SpringbootSample.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers/{id}")
	public Customers getCustomers(@PathVariable String id){
		return customerService.getCustomers(id);

	}

}
