package Interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// 인터페이스 형변환 실습
		Customer customer = new Customer();
		
		Buy buyer = customer;  //Buy 인터페이스의 메서드만 보임
		buyer.buy();
		buyer.order();
		
		System.out.println();
		Sell seller = customer;  //Sell 인터페이스의 메서드만 보임
		seller.sell();
		seller.order();
		
		System.out.println();
		customer.order();
		
		System.out.println();
		if(seller instanceof Customer) {
			Customer cust = (Customer)seller;
			cust.buy();
			cust.sell();
			
		}
		
		System.out.println();
		if(buyer instanceof Customer) {
			Customer cust2 = (Customer)buyer;
			cust2.buy();
			cust2.sell();
		}
		
	}

}
