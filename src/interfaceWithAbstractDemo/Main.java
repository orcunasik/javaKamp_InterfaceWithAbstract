package interfaceWithAbstractDemo;

import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceManager());
		Customer customer = new Customer();
		customer.setNationalityId("14725836912");
		customer.setFirstName("Orçun");
		customer.setLastName("Aþýk");
		customer.setDateOfBirth(LocalDate.of(1991, 1, 20));
		
		customerManager.save(customer);

	}

}
