public class OddOrEven {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int n = IO.readInt();
		if (n % 2 == 0) {
			System.out.println("Even.");
		} else {
			System.out.println("Odd!");
		}
	}
}