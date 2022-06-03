package ArrayProgram;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		System.out.println("Array Element :");
		int[] array = new int[] { 5, 4, 2, 3, 1 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println("\nAscending order array Element :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
