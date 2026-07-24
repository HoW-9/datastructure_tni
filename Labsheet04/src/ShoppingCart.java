import java.util.LinkedList;

public class ShoppingCart {

	public static void main(String[] args) {
		LinkedList<String> cart = new LinkedList<String>();
		
		cart.add("Wireless Mouse");           // n0.1
		cart.add("Mechanical Keyboard");         // n0.2
		cart.add("USB-C Hub");                  // n0.3
		System.out.println(cart);          // n0.4
		
		cart.add(1,"Mouse Pad");           // n0.5
		System.out.println(cart);           // n0.6
		
		
		cart.removeLast();               // n0.7
		System.out.println(cart);           // n0.8
		
		cart.remove("Mouse Pad");         //no.9
		System.out.println(cart);          //no.10
		
		cart.add("Monitor");         //no.11
		System.out.println(cart);         //no.12
		
		cart.set(2, "PhoneHolder");        //no.13
		System.out.println(cart);         //no.14
		
		System.out.println(cart.getLast());       //no.15
		
	}

}
