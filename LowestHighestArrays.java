public class LowestHighestArrays {
	public static void main(String[] args) {
		int[] nums = { 10, 23, 67, 88, 256, 765, 56, 7, 56, 80 };
		int highest = 0;
		int lowest =0;

		for (int i=0; i<nums.length; ++i) {
			if (nums[i] > highest)
				highest = nums[i];
			if(nums[i] < lowest)
				lowest = nums[i];
		}

		System.out.println("The highes number in the array is " + highest);
		System.out.println("The lowest number in the array is " + lowest);
	}
}