package javaCampFive.dataAccess.concretes;

import java.util.List;

import javaCampFive.dataAccess.abstracts.CustomerDao;
import javaCampFive.entities.concretes.Customer;

public class MemoryCustomerDao implements CustomerDao{

	List<Customer> allCustomer;
	
	@Override
	public void add(Customer customer) {
		System.out.println("Kay�t i�lemi tamamland�");
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}