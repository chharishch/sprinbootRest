package SpringbootSample.Customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	private List<Customers> customers= Arrays.asList(
			new Customers("123","harry","chickenbiriyani"),
			new Customers("124","Anu","Vegbiriyani"),
			new Customers("125","Shravan","TofuViriyani")
			);
	public List<Customers> getAllCustomers(){
		return customers; 
	}
	public Customers getCustomers(String id) {
		// TODO Auto-generated method stub
		return customers.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	}


