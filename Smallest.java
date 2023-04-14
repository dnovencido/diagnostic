public class Smallest {
	public static void main(String[] args) {
		int[] nums = { 5, 10, 2, 8, 15, 3, 56, 78, 100, 23 };
		int firstNum = nums[0];
		int secondNum = nums[0];

		for (int i=0; i<nums.length; i++) {
			if(val > nums[i])
				val = nums[i];
		}

		System.out.println("The lowest value is " + val);
	}
}