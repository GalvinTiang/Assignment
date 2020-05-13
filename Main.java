
public class Main {

	public static void main(String[] args) {
		
		Restaurant1 r1 =  new Restaurant1() ;
		Restaurant2 r2 = new Restaurant2();
		Restaurant3 r3 = new Restaurant3();
		Restaurant4 r4 =  new Restaurant4();
		
		r1.greeting(); 
		r1.restaurantDetails();
		r1.setName("Lily");
		r1.setID(7479);
		System.out.println("My name is " + r1.getName() + "." + "IDNumber is " + r1.getID() + "." + "Ready to serve you.");
		r1.serviceProvided();
		r1.end();
		
		r2.greeting(); 
		r2.restaurantDetails();
		r2.setName("Karen");
		r2.setID(8747);
		System.out.println("My name is " + r2.getName() + "." + "IDNumber is " + r2.getID() + "." + "Ready to serve you.");
		r2.serviceProvided();
		r2.end();
		
		r3.greeting(); 
		r3.restaurantDetails();
		r3.setName("Victor");
		r3.setID(8774);
		System.out.println("My name is " + r3.getName() + "." + "IDNumber is " + r3.getID() + "." + "Ready to serve you.");
		r3.serviceProvided();
		r3.end();
		
		r4.greeting(); 
		r4.restaurantDetails();
		r4.setName("John");
		r4.setID(9755);
		System.out.println("My name is " + r4.getName() + "." + "IDNumber is " + r4.getID() + "." + "Ready to serve you.");
		r4.serviceProvided();
		r4.end();
	}

}
