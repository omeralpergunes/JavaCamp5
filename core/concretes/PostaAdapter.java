package javaCampFive.core.concretes;


import javaCampFive.core.abstracts.PostaService;
import javaCampFive.entities.concretes.SignInCustomer;
import javaCampFive.postas.postaManager;

public class PostaAdapter implements PostaService{

	@Override
	public boolean SignIn(SignInCustomer signInCustomer) {
		postaManager eposta= new postaManager();
		return eposta.login(signInCustomer.getEposta(), signInCustomer.getPassword());
		
	}

	@Override
	public void signIn(SignInCustomer signInCustomer) {
		// TODO Auto-generated method stub
		
	}

}