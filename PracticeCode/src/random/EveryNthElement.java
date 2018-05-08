package random;

public class EveryNthElement {

	public static void main(String[] args) {
		/*
		 *Showing how to pick/display every nth element in an array
		 *Also showing how to not show the 0 element in the array 
		 */
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < test.length; i+=3) {
			if (i == 0) {
				continue;
			}
			System.out.print(test[i]);
		}

	}

}
