package javaCampFive.business.abstracts;

import javaCampFive.entities.concretes.SignInCustomer;

public interface SignInService {

	void signInLocal(SignInCustomer customer);
	
	void signInAdapter(SignInCustomer customer);
	
}
