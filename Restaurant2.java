
public class Restaurant2 extends Restaurant {

	public static void restaurantDetails() {
		restaurantName("Atmosphere 360");
		operationHours(1130,2300);
	}
	
	public void serviceProvided () {
		super.serviceProvided();
		System.out.println();
		System.out.println("----------Special services that provided in FOC---------");
		System.out.println("-Resident Singer");
		System.out.println("-Romantic atmosphere");
		System.out.println("-Michelin-starred restaurant");
	}
}
