 package javaCampFive;

import javaCampFive.business.concretes.CustomerManager;
import javaCampFive.business.concretes.SignInManager;
import javaCampFive.core.concretes.PostaAdapter;
import javaCampFive.dataAccess.concretes.MemoryCustomerDao;
import javaCampFive.entities.concretes.Customer;
import javaCampFive.entities.concretes.SignInCustomer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager(new MemoryCustomerDao());
		Customer customer1 = new Customer(1, "Ömer","Güneþ","omeralpergunes@gmail.com","456545");
		Customer customer2 = new Customer(2,"Ömer","Güneþ","omeralpergunes@gmail.com","456545");
		
		customerManager.SignUpCustomer(customer1);
		
		customerManager.Verifyeposta(customer1);
		
		Customer customer3= new Customer(1,"Ömer","Güneþ","omeralpergunes@gmail.com","456545");
		Customer customer4= new Customer(1,"Ömer","Güneþ","omeralpergunes@gmail.com","456545");
		Customer customer5= new Customer(1,"Ömer","Güneþ","omeralpergunes@gmail.com","456545");
		Customer customer6= new Customer(1,"Ömer","Güneþ","omeralpergunes@gmail.com","456545");
		
		System.out.println("\n.. Kullanýcý Ekleme Bölümü");
		customerManager.SignUpCustomer(customer3);
		customerManager.SignUpCustomer(customer4);
		customerManager.SignUpCustomer(customer5);
		customerManager.SignUpCustomer(customer6);
		customerManager.SignUpCustomer(customer1);
		customerManager.SignUpCustomer(customer2);
		
		System.out.println("\n----Sign in Local------");
		SignInManager signInManager= new SignInManager(customerManager);
		signInManager.signInLocal(new SignInCustomer("omeralpergunes@gmail.com","66265"));
		signInManager.signInLocal(new SignInCustomer("enginhoca@gmail.com","5623"));

		System.out.println("\n----Sign in Posta------");
		SignInManager signInManagerPosta= new SignInManager(new PostaAdapter());
		signInManagerPosta.signInAdapter(new SignInCustomer("omeralpergunes@gmail.com","66265"));
		signInManagerPosta.signInAdapter(new SignInCustomer("enginhoca@gmail.com","5623"));
	}

}
