public class EvenAndOdd {
	public static void main(String[] args) {
		System.out.println("Enter numbers, end with 0:");

		int evens = 0;
		int odds = 0;

		int n = IO.readInt();
		while (n != 0) {
			if (n % 2 == 0) {
				evens += 1; // evens = evens + 1
			} else {
				odds += 1; 
			}

			System.out.println("Enter another number:");
			n = IO.readInt();
		}

		System.out.println("Even numbers: " + evens);
		System.out.println("Odd numbers: " + odds);
	}
}