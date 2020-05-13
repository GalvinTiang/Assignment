
public class Restaurant4 extends Restaurant {
	
	public static void restaurantDetails() {
		restaurantName("Hai Di Lao");
		operationHours(1800,0130);
	}
	
	public void serviceProvided () {
		super.serviceProvided();
		System.out.println();
		System.out.println("----------Special services that provided in FOC---------");
		System.out.println("-Outstanding service");
		System.out.println("-2-3 waiter/waiteress serve in a specific area");
		System.out.println("-Apron is provided");
		System.out.println("-Special birthday surprise celebration");
		System.out.println("-Manicure");
		System.out.println("-Free snacks");
	}
}
