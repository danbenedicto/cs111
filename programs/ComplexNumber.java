public class ComplexNumber {

	public int real;
	public int complex;

	public int getReal() {
		return this.real;
	}

	public ComplexNumber add(ComplexNumber other) {
		ComplexNumber sum = new ComplexNumber();
		sum.real = this.real + other.real;
		sum.complex = this.complex + other.complex;
		return sum;
	}

	public static ComplexNumber sum(ComplexNumber c1,
	ComplexNumber c2) {
		ComplexNumber sum = new ComplexNumber();
		sum.real = c1.real + c2.real;
		sum.complex = c1.complex + c2.complex;
		return sum;
	}

	public void printString() {
		System.out.print(real);
		System.out.print("+");
		System.out.print(complex);
		System.out.println("i");
	}
}