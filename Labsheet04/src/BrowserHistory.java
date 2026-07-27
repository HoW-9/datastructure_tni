import java.util.LinkedList;

public class BrowserHistory {

	public static void main(String[] args) {
		LinkedList<String> history = new LinkedList<String>();

		history.add("google.com");           // n0.1
		history.add("youtube.com ");         // n0.2
		history.add("github.com");                  // n0.3
		System.out.println(history);          // n0.4
		
		history.removeLast();           // n0.5
		System.out.println(history);           // n0.6
		
		
		history.add("shopee.com");                
		history.add("wikipedia.org");         
		history.add("claude.ai ");        
		System.out.println(history);         
		
		history.remove(1);        
		System.out.println(history);         
		
		System.out.println(history.getLast()); 
		 System.out.println("current page = " + history.getLast());
//			System.out.println("current page = " + cart.peekLast());

	        System.out.println("Visited youtube.com = " + history.contains("youtube.com"));


	        System.out.println("Go back to previous page = " + history.get(history.size() - 2));

	        System.out.println("Go back to previous page again = " + history.get(history.size() - 3));

	        history.clear();
	        System.out.println(history);
	}

}
