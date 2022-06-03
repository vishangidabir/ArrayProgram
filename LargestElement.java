package ArrayProgram;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 7, 2, 3, 5, 8 };
		int large = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > large) {
				large = array[i];
			}
		}
		System.out.println("Largest element of Array  :" + large);
	}

}
