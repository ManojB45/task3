package task3;

import java.util.Scanner;



interface Taxable {
	 double SALES_TAX = 0.07;
	 double INCOME_TAX = 0.105;

	 double calcTax();
	}

	//Employee class definition
	class Employee implements Taxable {
	 private int empId;
	 private String name;
	 private double salary;

	 public Employee(int empId, String name, double salary) {
	     this.empId = empId;
	     this.name = name;
	     this.salary = salary;
	 }

	 @Override
	 public double calcTax() {
	     return salary * INCOME_TAX;
	 }

	 @Override
	 public String toString() {
	     return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary;
	 }
	}

	//Product class definition
	class Product implements Taxable {
	 private int pid;
	 private double price;
	 private int quantity;

	 public Product(int pid, double price, int quantity) {
	     this.pid = pid;
	     this.price = price;
	     this.quantity = quantity;
	 }

	 @Override
	 public double calcTax() {
	     return price * SALES_TAX;
	 }

	 @Override
	 public String toString() {
	     return "Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity;
	 }
	}






















public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

	     // Accept employee information from user
	     System.out.println("Enter Employee Information:");
	     System.out.print("Employee ID: ");
	     int empId = scanner.nextInt();
	     scanner.nextLine(); // Consume newline
	     System.out.print("Name: ");
	     String name = scanner.nextLine();
	     System.out.print("Salary: ");
	     double salary = scanner.nextDouble();
	     Employee employee = new Employee(empId, name, salary);
	     double incomeTax = employee.calcTax();

	     // Accept product information from user
	     System.out.println("\nEnter Product Information:");
	     System.out.print("Product ID: ");
	     int pid = scanner.nextInt();
	     System.out.print("Price: ");
	     double price = scanner.nextDouble();
	     System.out.print("Quantity: ");
	     int quantity = scanner.nextInt();
	     Product product = new Product(pid, price, quantity);
	     double salesTax = product.calcTax();

	     // Print the calculated taxes
	     System.out.println("\nEmployee Information:");
	     System.out.println(employee);
	     System.out.println("Income Tax: " + incomeTax);

	     System.out.println("\nProduct Information:");
	     System.out.println(product);
	     System.out.println("Sales Tax (per unit): " + salesTax);

	     scanner.close();
	}

}
