package SpringbootSample.Customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class OrderService {
	
	private List<Order>  order= Arrays.asList(
			new Order("123","harry","chickenbiriyani","In Oven"),
			new Order("124","Anu","Vegbiriyani","ready"),
			new Order("125","Shravan","TofuViriyani","In Transit")
			);
	public List<Order> getAllOrder(){
		return order; 
	}
	public  String getOrder(String id) {
		// TODO Auto-generated method stub
		return order.stream().filter(t -> t.getOrder_id().equals(id)).findFirst().get().getOrder_status();
	}
	}