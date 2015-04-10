public class SimpleCalculator {
	public static void main(String[] args) {
		System.out.println("Enter 'yes' to add, or 'no' to subtract.");
		boolean adding = IO.readBoolean();

		System.out.println("Enter first number");
		double number1 = IO.readDouble();
		System.out.println("Enter second number");
		double number2 = IO.readDouble();

		if (adding) {
			double answer = number1 + number2;
		} else {
			double answer = number1 - number2;
		}

		System.out.println("Answer: " + answer);
	}
}