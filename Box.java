public class Box {
	public static void main(String[] args) {
		int range = 3;
		for (int i=0; i<=range; i++) {
			for(int j=0; j<=range; j++) {
				if(j==0 || j==range || i==0 || i==range) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}