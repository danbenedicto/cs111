public class ComplexDriver {
	public static void main(String[] args) {
		System.out.println("Enter the real part:");
		int real = IO.readInt();

		System.out.println("Enter the complex part:");
		int complex = IO.readInt();

		ComplexNumber cn = new ComplexNumber();

		cn.real = real;
		cn.complex = complex;

		ComplexNumber cn2 = new ComplexNumber();
		cn2.real = 5;
		cn2.complex = 10;

		ComplexNumber sum = cn.add(cn2);
		sum.printString();
	}
}