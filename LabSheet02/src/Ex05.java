
public class Ex05 {

	public static void main(String[] args) {
		Arraycontroller nums = new Arraycontroller();
		nums.display("All elements:");
		
		int[] new_nums = new int[nums.getSize()-1];
		
		//copy
		for (int i=0; i<new_nums.length;i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		//display
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted the last index");

	}

}
