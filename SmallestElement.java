package ArrayProgram;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 7, 2, 3, 5, 8 };
		int small = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] < small) {
				small = array[i];
			}
		}
		System.out.println("Smallest element of Array  :" + small);
	}

}
