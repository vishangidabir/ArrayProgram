package ArrayProgram;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array Element :");
		int[] array = new int[] { 1, 2, 3, 5, 1, 1, 2, 3, 5, 4 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nDuplicate Array Element :");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.print(array[j] + " ");

				}
			}
		}
	}

}
