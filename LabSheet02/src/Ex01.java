
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {23, 67, 8, 91, 45, 12, 78}; 
		
		System.out.println("Lenght = " + nums.length);
		System.out.println("The frist element = " + nums[0]);
		System.out.println("The last element = " + nums[nums.length-1]);
		System.out.println("The middle element = " + nums[nums.length/2]);
		
		System.out.println("Display all elements:");
		boolean frist_element = true;
		for (int num : nums) {
			/*if (!frist_element) {
				System.out.print(",");
			}*/
			System.out.print((!frist_element ? ", " : "")+num);
			frist_element = false;
		}
	}

}
