public class MultiplesOfTwo {
	public static void main(String[] args) {
		int[] nums = { 10, 23, 67, 88, 256, 765, 56, 7, 56, 80 };

		for (int i=0; i<nums.length; i++) {
			if(nums[i] % 2 == 0)
				System.out.print(nums[i] + " ");
		}
	}
}