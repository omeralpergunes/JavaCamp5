package javaCampFive.business.abstracts;

import javaCampFive.entities.concretes.SignInCustomer;

public interface CustomerService {

	boolean validCustomer(SignInCustomer signInCustomer) throws Exception;

	void Verifyeposta(SignInCustomer signInCustomer);

	boolean SignInCustomerExist(SignInCustomer signInCustomer);

	boolean SignUpCustomer(SignInCustomer signInCustomer) ;
}
