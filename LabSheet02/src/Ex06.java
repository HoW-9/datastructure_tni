
public class Ex06 {

	public static void main(String[] args) {
		Arraycontroller nums = new Arraycontroller();
		nums.display("All element:");
		
		int[] new_nums = new int[nums.getSize()];
		
		int delete_index = 2;
		//Copy data F
		for (int i=0; i<delete_index; i++) { // looping between 0 and delete_index-1 (➔ 1)
		 new_nums[i] = nums.getNums()[i];
		}
		
		//Copy data L
		for (int i=delete_index+1; i<nums.getSize(); i++) {
			 // looping between delete_index+1 (➔ 3) and nums.length-1 (➔ 4)
			 new_nums[i - 1] = nums.getNums()[i];
			}
		
		// display
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted index");
	}

}
