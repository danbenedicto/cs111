public class EmployeeDriver {
	public static void main(String[] args) {
		System.out.println("creating employees");

		Employee e1 = new Employee("Bob", 50, 3000);
		Employee e2 = new Employee("Rob", 20, 1000);
		Employee e3 = new Employee("Tom", 10);

		e1.printInfo();
		e2.printInfo();
		e3.printInfo();

		System.out.println("working employees a few hours");
		e1.work(10);
		e2.work(20);
		e3.work(30);

		e1.printInfo();
		e2.printInfo();
		e3.printInfo();

		System.out.println("All done, going home!");
	}
}

daniel.benedicto@rutgers.edu