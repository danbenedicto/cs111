public class InsertionSort {
	public static void main(String[] args) {
		String[] strings = {"Elephant", "Dog", "Cat", "Bird",
			"Alpaca", "Buffalo"};

		sort(strings);
		printArray(strings);
	}

	/* Perform insertion sort on the given array */
	public static void sort(String[] input) {
		for (int i = 1; i < input.length; i++) {
			int j = i;
			while (j > 0 && input[j].compareTo(input[j-1]) < 0) {
				// swap
				String temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
				j--;
			}
		}
	}

	public static void printArray(String[] input) {
		for (String s : input) {
			System.out.println(s);
		}
	}
}