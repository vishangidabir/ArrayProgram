package ArrayProgram;

public class OddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Print array in odd postion:");
		for (int i = 0; i < array.length; i = i + 2) {
			System.out.print(array[i] + " ");
		}
	}

}
