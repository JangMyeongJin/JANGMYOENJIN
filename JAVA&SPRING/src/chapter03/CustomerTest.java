package chapter03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(1100, "이순신");
		int price = customerLee.calcPrice(1000);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(2200, "김유신");
		price = customerKim.calcPrice(1000);
		customerKim.bonusPoint = 20000;
		System.out.println(customerKim.showCustomerInfo() + price);
		
	}

}
