public class BinarySearch {
	public static void main(String[] args) {
		String[] strings = { "Alpaca", "Beagle", "Bigfoot", "Bird", "Buffalo",
			"Cat", "Dog", "Dogzilla", "Elephant", "Hamster", "Penguin",
			"Rhinosaur", "Termite"
		};

		System.out.println("The sorted list is:");
		printArray(strings);

		System.out.println("Enter a term to search: ");
		String s = IO.readString();

		int result = search(strings, s);
		if (result == -1) {
			System.out.println("Could not find " + s);
		} else {
			System.out.println("search term " + s + " found at " + result);
		}

	}

	public static int search(String[] input, String target) {
		int lo = 0;                // left bound of area to be searched, inclusive
		int hi = input.length - 1; // right bound, also inclusive

		while (lo <= hi) {
			int mid = (hi + lo) / 2;
			int c = target.compareTo(input[mid]);

			if (c == 0) {
				// match!
				return mid;
			} else if (c < 0) {
				// target would be to left of mid
				hi = mid - 1;
			} else {
				// target would be to the right of mid
				lo = mid + 1;
			}
		}

		return -1;
	}

	public static void printArray(String[] input) {
		for (String s : input) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
