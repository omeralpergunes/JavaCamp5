package javaCampFive.business.concretes;

import javaCampFive.business.abstracts.CustomerService;
import javaCampFive.business.abstracts.SignInService;
import javaCampFive.core.abstracts.PostaService;
import javaCampFive.entities.concretes.SignInCustomer;


public class SignInManager implements SignInService {
	
	private CustomerService customerService;
	private PostaService postaService;

	public SignInManager(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public SignInManager(PostaService postaService) {
		this.postaService = postaService;
	}

	@Override
	public void signInLocal(SignInCustomer signInCustomer) {

		if ((signInCustomer.getEposta() != null) && (signInCustomer.getPassword() != null)) {
			if (customerService.SignInCustomerExist(signInCustomer)) {
				System.out.println("Giri� Ba�ar�l�");
				return;
			}
		}
		System.out.println("Bu Kullan�c� Kay�tl� De�ildir");

	}

	@Override
	public void signInAdapter(SignInCustomer signInCustomer) {
		postaService.signIn(signInCustomer);
	}

}