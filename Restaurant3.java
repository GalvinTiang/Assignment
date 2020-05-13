
public class Restaurant3 extends Restaurant {
	
	public static void restaurantDetails() {
		restaurantName("Quivo Restaurant");
		operationHours(1500,0200);
	}
	public void serviceProvided () {
		super.serviceProvided();
		System.out.println();
		System.out.println("----------Special services that provided in FOC---------");
		System.out.println("-Free membership as long as spend RM100 and above");
		System.out.println("-Membership discount");
		System.out.println("-Birthday discount");
	}
	
}
