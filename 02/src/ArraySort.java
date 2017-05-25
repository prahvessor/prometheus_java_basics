public class ArraySort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		//PUT YOUR CODE HERE
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < (length - 1 - i); j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}

		//PUT YOUR CODE HERE

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}