public class Intersect {
	public static void main (String[] args) {
		
		// y = dx^2 + fx + g
		System.out.println("Enter the constant d:");
		int d = IO.readInt();

		if (d == 0) {
			System.out.println("d cannot be 0.");
			return; // end the program
		}

		System.out.println("Enter the constant f:");
		int f = IO.readInt();
		System.out.println("Enter the constant g:");
		int g = IO.readInt();

		// y = mx + b
		System.out.println("Enter the constant m:");
		int m = IO.readInt();
		System.out.println("Enter the constant b:");
		int b = IO.readInt();

		int p1 = d;
		int p2 = f - m;
		int p3 = g - b;

		double discriminant = p2*p2 - 4*p1*p3;

		if (discriminant < 0) {
			// no real intersections
			System.out.println("No intersection");
		} else if (discriminant == 0) {
			// one real intersection
			double x1 = (-p2 + Math.sqrt(discriminant)) / (2 * p1);
			double y1 = m * x1 + b;
			System.out.println("The intersection(s) is/are:");
			System.out.println("(" + x1 + "," + y1 + ")");
		} else {
			// two real intersections
			double x1 = (-p2 + Math.sqrt(discriminant)) / (2 * p1);
			double x2 = (-p2 - Math.sqrt(discriminant)) / (2 * p1);
			double y1 = m * x1 + b;
			double y2 = m * x2 + b;

			System.out.println("The intersection(s) is/are:");
			System.out.println("(" + x1 + "," + y1 + ")");
			System.out.println("(" + x2 + "," + y2 + ")");
		}

	}
}