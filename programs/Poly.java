public class Poly {
	public static void main(String[] args) {
		System.out.println("Enter the first root:");
		int r1 = IO.readInt();

		System.out.println("Enter the second root");
		int r2 = IO.readInt();

		System.out.println("Enter the third root:");
		int r3 = IO.readInt();

		int b = -r1 - r2 - r3;
		int c = r1 * r2 + r1 * r3 + r2 * r3;
		int d = -r1 * r2 * r3;

		System.out.println("x^3 + " + b + "x^2 + " + c + "x + " + d);

	}
}