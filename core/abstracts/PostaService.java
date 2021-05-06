package javaCampFive.core.abstracts;

import javaCampFive.entities.concretes.SignInCustomer;

public interface PostaService {

	boolean SignIn(SignInCustomer signInCustomer);

	void signIn(SignInCustomer signInCustomer);
}
