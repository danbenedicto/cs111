public class ComplexNumber {

	public int real;
	public int imaginary;

	public int getReal() {
		return this.real;
	}

	public ComplexNumber add(ComplexNumber other) {
		ComplexNumber sum = new ComplexNumber();
		sum.real = this.real + other.real;
		sum.imaginary = this.imaginary + other.imaginary;
		return sum;
	}

	public static ComplexNumber sum(ComplexNumber c1,
	ComplexNumber c2) {
		ComplexNumber sum = new ComplexNumber();
		sum.real = c1.real + c2.real;
		sum.imaginary = c1.imaginary + c2.imaginary;
		return sum;
	}

	public void print() {
		System.out.print(real);
		System.out.print(" + ");
		System.out.print(imaginary);
		System.out.println("i");
	}
}