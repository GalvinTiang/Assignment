
public class Restaurant1 extends Restaurant{
	
	
	public static void restaurantDetails() {
		restaurantName("Korean BBQ");
		operationHours(1000,2200);
	}
	
	public void serviceProvided () {
		super.serviceProvided();
		System.out.println();
		System.out.println("----------Special services that provided in FOC---------");
		System.out.println("-Unlimited relish");
		System.out.println("-Unlimted light refreshment");
		System.out.println("-Refillable Drink");
	}
	
	
}
