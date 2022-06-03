package ArrayProgram;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		System.out.print("Element of Array :");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nReserve Element of Array :");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
