package SpringbootSample.Customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	private List<Customers> customers= Arrays.asList(
			new Customers("123","harry","chickenbiriyani","123"),
			new Customers("124","Anu","Vegbiriyani","124"),
			new Customers("125","Shravan","TofuViriyani","125")
			);
	public List<Customers> getAllCustomers(){
		return customers; 
	}
	public String getCustomers(String id) {		
		return customers.stream().filter(t -> t.getId().equals(id)).findFirst().get().getCustomer_name();
	}
	public String validateCustomer(String id,String pswd) {
		String s="";
		for(int i=0;i<=customers.size();i++){
			System.out.println(customers.get(i).getCustomer_id());
			if(id.toString().equals(customers.get(i).getCustomer_id().toString())){
				if(pswd.toString().equals(customers.get(i).getPassword())){
					s="Customer Name :"+customers.stream().filter(t -> t.getId().equals(id)).findFirst().get().getCustomer_name()+"\n"+"Customer Order :"+customers.stream().filter(t -> t.getId().equals(id)).findFirst().get().getOrder();
					break;
				}
			}
		}		
		return s;
	}
	}


