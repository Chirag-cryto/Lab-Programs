package labchirag;

public class Employee {
  String name;
  int id;
  double salary;
  
  //employee function
  Employee (String name ,int id , double salary){
	  this.name = name;
	  this.id = id;
	  this.salary = salary;
  }
  
  //funtion to display details
  void displayDetails () {
	  System.out.println("Employee ID Number:"+ this.id);
	  System.out.println("Name:"+ this.name);
	  System.out.println("Salary in Rs."+ this.salary);
	  System.out.println("Employee Details are as follows");
  }
  
  //function for increasing detils
  void increaseSalary(double percentage) {
	  double increment = (this.salary*10)/100;
	  salary = salary + increment;
	  System.out.println(this.name + " s salary is incresed by" + increment+"%");
  }

}
