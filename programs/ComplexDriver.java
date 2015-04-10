public class ComplexDriver {
	public static void main(String[] args) {
		System.out.println("Enter the real part:");
		int real = IO.readInt();

		System.out.println("Enter the imaginary part:");
		int imag = IO.readInt();

		ComplexNumber cn = new ComplexNumber();

		cn.real = real;
		cn.imaginary = imag;

		ComplexNumber cn2 = new ComplexNumber();
		cn2.real = 5;
		cn2.imaginary = 10;

		ComplexNumber sum = cn.add(cn2);
		sum.print();
	}
}