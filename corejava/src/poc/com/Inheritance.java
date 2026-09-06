package poc.com;

import java.util.Scanner;

class Employee {

	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee ID : " + id);
		System.out.println("Name        : " + name);
		System.out.println("Salary      : ₹" + salary);
	}
}

class Developer extends Employee {

	double bonus = 10000;

	Developer(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	void display() {

		super.display();

		System.out.println("Role        : Developer");
		System.out.println("Bonus       : ₹" + bonus);
		System.out.println("Total Salary: ₹" + (salary + bonus));
	}
}

class Manager extends Employee {

	double allowance = 15000;

	Manager(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	void display() {

		super.display();

		System.out.println("Role        : Manager");
		System.out.println("Allowance   : ₹" + allowance);
		System.out.println("Total Salary: ₹" + (salary + allowance));
	}
}

class Tester extends Employee {

	double bonus = 7000;

	Tester(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	void display() {

		super.display();

		System.out.println("Role        : Tester");
		System.out.println("Bonus       : ₹" + bonus);
		System.out.println("Total Salary: ₹" + (salary + bonus));
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("       EMPLOYEE PAYROLL");
		System.out.println("================================");

		System.out.print("Enter Employee ID : ");
		int id = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Basic Salary : ");
		double salary = sc.nextDouble();

		System.out.println("\nSelect Employee Role");
		System.out.println("1. Developer");
		System.out.println("2. Manager");
		System.out.println("3. Tester");

		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();

		Employee employee = null;

		switch (choice) {

		case 1 -> {
			employee = new Developer(id, name, salary);
		}

		case 2 -> {
			employee = new Manager(id, name, salary);
		}

		case 3 -> {
			employee = new Tester(id, name, salary);
		}

		default -> {
			System.out.println("Invalid choice!");
		}
		}

		if (employee != null) {

			System.out.println("\n================================");
			System.out.println("        EMPLOYEE DETAILS");
			System.out.println("================================");

			employee.display();

			System.out.println("================================");
		}

		sc.close();
	}
}