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
		
		history.remove("youtube.com");        
		System.out.println(history);         
		
		System.out.println(history.getLast());      
	}

}
