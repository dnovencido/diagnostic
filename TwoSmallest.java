public class TwoSmallest {
	public static void main(String[] args) {
		int[] arr = { 10, 23, 67, 88, 256, 765, 56 ,7, 56, 80 };
		int smallest = Integer.MAX_VALUE;
		for (int i=0; i<arr.length; i++) {
			if(arr[i] < smallest) {	
				smallest = arr[i];
			}
		}

		System.out.println("The smallest element is: " + smallest);

		int second_smallest = Integer.MAX_VALUE;

		for (int j=0; j<arr.length; j++) {
			if (arr[j] < second_smallest && arr[j] > smallest) {
				second_smallest = arr[j];
			}
		}

		System.out.println("The second smallest element is: " + second_smallest);
	}
}