import java.util.Stack; // or import java.util.*;

public class LabStack02 {
	public static void main(String[] args) {
		// create a new stack
		Stack<Integer> stacks = new Stack<>();
		// push element into the stack
		int number = 1;
		while (number <=5) {
			stacks.push(number++);
			System.out.println("Push in track : "+stacks.peek());
		}
		System.out.println("Train car after into daed-end track : "+stacks+"\n");
		
		while (!stacks.empty()) {
			System.out.println("Pop from track : "+stacks.pop());
		}
		System.out.println("Train car after out daed-end track : "+stacks+ "\n");
	}
}
