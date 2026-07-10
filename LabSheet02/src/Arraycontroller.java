
public class Arraycontroller {

	private int[] nums;
		
	public Arraycontroller() {
		nums = new int[] {23, 67, 8, 91, 45, 12, 78};
	}
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	public int getSize() {
		return nums.length;
	}
	
	public  void display(String message) {
		System.out.println(message);
		boolean frist_element = true;
		for (int num : nums) {
			System.out.print((!frist_element ? ", " : "")+num);
			frist_element = false;
		}
	}
}
