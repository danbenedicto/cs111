# CS 111 - Exam 2 Review

## Arrays

declaring/initializing a 1D array:

```java	
int[] numbers = new int[n];         // contains 0s by default
boolean[] bools = new boolean[n];   // contains false by default
```

declaring/initializing a 1D array with literals:

```java
int[] numbers = {1, 2, 3, 4};
```

declaring/initializing a 2D array:

```java
int[][] numbers = new int[n][m];
```

declaring/initializing a 2D array with literals:

```java
int[][] numbers = {{1,2,3}, {4,5,6}}
// numbers[1]    => {4,5,6}
// numbers[1][0] => 4
```

filling array values with user input:

```java
System.out.println("How many rows?");
int rows = IO.readInt();
System.out.println("How many columns?");
int columns = IO.readInt();

int[][] numbers = new int[rows][columns];

for (int i = 0; i < rows; i++) {
	System.out.println("Enter values for row " + i + ":");
	for (int j = 0; j < columns; j++) {
		numbers[i][j] = IO.readInt();
	}
}
```

making methods that take arrays as parameters:

```java
public static double mean(int[] numbers) {
	double sum = 0.0;
	for (int i = 0; i < numbers.length; i++) {
		sum += numbers[i];
	}
	return sum / numbers.length;
}
```

array indexing and lengths, especially for 2D arrays

```java
int[][] numbers = {{1,2,3}, {4,5,6}};
System.out.println(numbers.length)     // 2
System.out.println(numbers[0].length)  // 3
```

looping through 1D and 2D arrays

## Strings

Commonly used String methods:

`int indexOf(char ch)` and `int indexOf(char ch, int fromIndex)`

```java
"program".indexOf('r')     // 1
"program".indexOf('r', 2)  // 4
"program".indexOf('R')     // -1
```

`char charAt(int index)`

`String substring(int beginIndex, int endIndex)`
```java
"applee".substring(2, 4)  // "pl"
```

`String substring(int beginIndex)`
```java
"applee".substring(2)     // "plee"
```

`int length()` (note that this needs parentheses unlike for arrays)

`boolean equals(String anotherString)` for comparison, not `==`
- ways to check for empty string: `s.isEmpty()` or `s.equals("")` or `s.length() == 0`

`boolean startsWith(String prefix)`

`int compareTo(String anotherString)` (maybe)

String concatenation:

- difference between `"a" + 'b' + 'c'`  and  `'a' + 'b' + "c"` (not that important, but interesting)

## Objects

Basically, you probably should be able to design a class, determine what
attributes should belong to it, and implement constructors/methods. Also, after
implementing a class, you should be able to use it in a 'driver program' with
a main method. The `Employee` exercise from recitation is a good example of this.

### A note about static vs. non-static methods

A static method belongs to the class itself. A non-static (aka instance) method
belongs to each object that is generated from that class. For example, recall
the recitation where we created an `Employee` class. Consider the following code:

```java
// make a new Employee with rate = $8/hr and initial balance $0
Employee e = new Employee("Dan", 8);

e.work(10);	// make him work for 10 hours (his balance should go up to $80)
```

Here, `work` is a non-static method because it modifies (and needs access to)
the attributes of a particular Employee instance. Static methods, on the other
hand, aren't called on any particular object.

### Example of a class

Here's what the Employee class might look like:

```java
public class Employee {
	
	String name;
	int rate;
	int balance;

	public Employee(String name, int rate, int balance) {
		this.name = name;
		this.rate = rate;
		this.balance = balance;
	}

	/* Alternate constructor, with default balance 0 */
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		this.balance = 0;  // could also just say `balance = 0;` without `this`
	}

	public void work(int hours) {
		this.balance += this.rate * hours;
	}

	public void printInfo() {
		// e.g. "Name: Dan | Rate: $8/hr | Balance: $80"
		System.out.print("Name: ");
		System.out.print(this.name);
		System.out.print(" | Rate: $");
		System.out.print(this.rate);
		System.out.print("/hr | Balance: $");
		System.out.print(this.balance);
		System.out.println();
	}

	public boolean isMillionaire() {
		return (this.balance >= 1000000);
	}

}
```
