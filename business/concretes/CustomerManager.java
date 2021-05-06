package javaCampFive.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampFive.business.abstracts.CustomerService;
import javaCampFive.dataAccess.abstracts.CustomerDao;
import javaCampFive.entities.concretes.Customer;
import javaCampFive.entities.concretes.SignInCustomer;

public class CustomerManager implements CustomerService{
	
	
	List<Customer> _allCustomer;
	CustomerDao _customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		super();
		this._customerDao = customerDao;
		_allCustomer = new ArrayList<Customer>();
	}

	public boolean validCustomer(Customer customer) {

		return validName(customer.getFirstName()) & validName(customer.getLastName()) & validEmail(customer.getEposta())
				& validPassword(customer.getPassword());

	}

	private boolean validName(String value) {

		if (value != null) {
			if (value.length() > 2) {
				return true;
			}
		}
		System.out.println("Hata : Geçerli isim-soyisim bilgisi giriniz.");
		return false;

	}

	private boolean validEmail(String value) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9\\_\\.\\-]+[@][a-z]+[.][a-z]{3}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.find()) {
			return true;
		}
		System.out.println("Hata : Geçerli bir posta giriniz");
		return false;

	}

	private boolean validPassword(String value) {

		if (value.length() > 5) {
			return true;
		}
		System.out.println("Hata Aldýnýz : Oluþturacaðýnýz Þifre en az 6 karakterden oluþmalýdýr.");
		return false;

	}

	public boolean SignUpCustomer(Customer customer) {

		boolean resultCustomer = validCustomer(customer);
		if (resultCustomer) {
			boolean result = IsEmailNotExist(customer.getEposta());

			if (result) {
				_allCustomer.add(customer);
				_customerDao.add(customer);
				System.out.println("Uyarýnýz : Posta Doðrulama için mail gönderilmiþtir.");
				return true;
			}
			System.out.println("Hata Aldýnýz : Posta sistemde kayýtlý haldedir");
			return false;
		}
		return false;
		// throw new Exception("Email adresi sistemde kayýtlýdýr. ");
	}

	private boolean IsEmailNotExist(String email) {

		if (!_allCustomer.stream().anyMatch(a -> a.getEposta().equals(email)))
			return true;

		return false;

	}

	public void Verifyeposta(Customer customer) {
		customer.getEposta();
		System.out.println("Email doðrulandý.");

	}

	@Override
	public boolean SignInCustomerExist(SignInCustomer signInCustomer) {

		Customer customer = _allCustomer.stream().filter((a) -> a.getEposta() == signInCustomer.getEposta()).findFirst().orElse(null);
		if (customer != null) {
			return customer.getPassword().equals(signInCustomer.getPassword()) ? true : false;
		}

		return false;

	}

	@Override
	public boolean validCustomer(SignInCustomer signInCustomer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Verifyeposta(SignInCustomer signInCustomer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean SignUpCustomer(SignInCustomer signInCustomer) {
		// TODO Auto-generated method stub
		return false;
	}}
