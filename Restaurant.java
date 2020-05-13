
public class Restaurant {
	
	private String nameWaiter;
	private int idWaiter;
	
	public static void greeting() {
		System.out.println("Welcome!!!");
	}
	
	public void serviceProvided() {
		System.out.println("-Booking");
		System.out.println("-Table Services");
		System.out.println("-Menu ");
		System.out.println("-Order food / beverages");
		System.out.println("-Bill pay by cash/credit card");
		System.out.println("-Restroom");
	}
	
	public void setName(String newName) {
		nameWaiter = newName;
	}
	
	public String getName() {
		return nameWaiter;
	}
	
	public void setID(int newID) {
		idWaiter = newID;
	}
	
	public int getID() {
		return idWaiter;
	}
	
	public static void restaurantName(String name) {
		System.out.println("This is" + " " + name + ".");
	}
	
	public static void operationHours(int timeStart , int timeEnd) {
		System.out.println("We will operate starting from" + " "+ timeStart + " " +"until" + " " + timeEnd);
	}
	
	public static void end() {
		System.out.println();
		System.out.println("It's our pleasant to serve you.");
		System.out.println("Hope to see you again soon !!!");
		System.out.println("--------------------END--------------------------");
		System.out.println();
	}
}
