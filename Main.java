package labchirag;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Chirag J", 59, 10000); //defining object
		Employee emp2 = new Employee("Likith Raj", 60, 25000);
		
		//displaying details
		System.out.println("Initial Employee Details are");
		emp1.displayDetails();
		emp2.displayDetails();
		
		emp1.increaseSalary(0);
		emp2.increaseSalary(0);
		
		System.out.println("Updated Employee Details are");
		
		//updated details
		emp1.displayDetails();
		emp2.displayDetails();
		
		emp1.increaseSalary(0);
		emp2.increaseSalary(0);
	}

}
