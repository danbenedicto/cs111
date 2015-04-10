public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter a year: ");
		int year = IO.readInt();

		if (year % 400 == 0) {
			System.out.println("Leap year!");
		} else if (year % 100 == 0) {
			System.out.println("Not a leap year!");
		} else if (year % 4 == 0) {
			System.out.println("Leap year!");
		} else {
			System.out.println("Not a leap year!");
		}
	}
}