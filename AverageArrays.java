public class AverageArrays {
	public static void main(String[] args) {
		int[] nums = {10, 23, 67, 88, 256, 765, 56, 7, 56, 80};
		double sum = 0;

		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}	

		System.out.println("The average is " + sum / nums.length);
	}
}