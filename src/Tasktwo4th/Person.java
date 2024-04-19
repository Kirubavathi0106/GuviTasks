package Tasktwo4th;
public class Person { //base class
	
	    String name;
	    int age;
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
        public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

class Employee extends Person {  //subclass
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);  
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Employee ID: " + employeeID + ", Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kiruba", 22, 101, 55000.00);
        emp.displayInfo();
    }
}
