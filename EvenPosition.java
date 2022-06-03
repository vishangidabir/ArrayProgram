package ArrayProgram;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Print Even Postion of Array :");
		for (int i = 1; i < array.length; i = i + 2) {
			System.out.print(array[i] + " ");
		}
	}

}
