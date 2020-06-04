import java.util.ArrayList;

public class ArrayListsProJ {

	public static void main(String[] args) {
		
		String [] foods = new String[4];
		foods [0]= "Cheese";
		foods [1]= "Korean Drumsticks";
		foods [2]= "Kimchi";
		foods [3]= "Kimchi Pancake";
		System.out.println(foods [1]);
		
		ArrayList<String> foodlist = new ArrayList<String> ();
		foodlist.add("Green Curry with LadyFinge");
		foodlist.add("Corn on the Cob");
		foodlist.add("Pandan Layer Cake");
		foodlist.add("Fruit Tartlet");
		
		foodlist.remove("Pandan Layer Cake");
		System.out.println(foodlist);

	}

}
