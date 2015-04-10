public class Employee {

	String name;
	double rate;
	double balance;

	public Employee(String name, double rate,
	double balance) {
		this.name = name;
		this.rate = rate;
		this.balance = balance;
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
		this.balance = 0;
	}

	public void work(int hours) {
		this.balance += this.rate * hours;
	}

	public void printInfo() {
		System.out.println("Employee name is " + name);
		System.out.println("Employee rate is " + rate);
		System.out.println("Employee balance is " + balance);
		System.out.println();
	}
}