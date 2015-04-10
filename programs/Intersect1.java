
public class Intersect1
{
	
	public static void main(String[] args) 
	{
		double d, f, g, m, b, A, B, C, X, Y;
		
		System.out.println("Intersection of a quadratic (y = dx^2 + fx + g) and a linear (y = mx + b) equation.");
		System.out.print("Enter the constant d: ");
		d = IO.readDouble();
		System.out.print("Enter the constant f: ");
		f = IO.readDouble();
		System.out.print("Enter the constant g: ");
		g = IO.readDouble();
		System.out.print("Enter the constant m: ");
		m = IO.readDouble();
		System.out.print("Enter the constant b: ");
		b = IO.readDouble();

		A = d;
		B = f - m;
		C = g - b;
		X = 0.0;
		Y = 0.0;
		
		if (A == 0) 
		{
			if (B == 0) 
			{
				if (C == 0) 
				{
					System.out.println("The intersection(s) is/are: ");
					System.out.println("Infinite.");	
				}
				else 
				{
					System.out.println("The intersection(s)is/are: ");
					System.out.println("none.");
				}
			}
			else 
			{
				X = -C / B;
				Y = m * X + b;
				System.out.println("The intersection(s)is/are: ");
				System.out.println("("+X+","+Y+")");		
			}
		}

		else 
		{
			if ((B * B - 4.0 * A * C) < 0) 
			{
				System.out.println("This is a non-real solution (imaginary).");
				return;
			}
			
			
			X = (-B + Math.sqrt(B * B - 4.0 * A * C)) / (2.0 * A);
			if (X == 0)
			{
				X = 0.0;
			}
			Y = m * X + b;
			
			if (B == 0) 
			{
				if (C == 0) 
				{
					System.out.println("The intersection(s) is/are: ");
					System.out.println("("+X+","+Y+")");
					System.exit(0);
				}
				else 
				{
					System.out.println("The intersection(s)is/are: ");
					System.out.println("None.");
					System.exit(0);
				}
			}
			
			System.out.println("The intersection(s) is/are: ");
			System.out.println("("+X+","+Y+")");
			X = (-B - Math.sqrt(B * B - 4.0 * A * C)) / (2.0 * A);
			if (X == 0)
			{
				X = 0.0;
			}
			Y = m * X + b;
			System.out.println("("+X+","+Y+")");

		}

	}

}
