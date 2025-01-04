package oops_Basic_Task;

 class Member {
	 public int age;
	 public String name;
	 public long phno;
	 public String address;
	 public double salary;
	 public void printSalary(String salary) {
		 System.out.println("Your salary is "+salary);
	 }

}
class Manager extends Member{
	public String specilization;
	public String department;
	
}
class Employee extends Member{
	public String specilization;
	public String department;
	
}
public class Main{
	public static void main(String[] args) {
		Manager manager=new  Manager();
		manager.age=32;
		manager.name="Kumar";
		manager.address="HYD";
		manager.salary=49.564;
		manager.phno=123456789;
		manager.department="Manager";
		manager.specilization="SDE1";
		System.out.println(manager.name+" "+ manager.age+" "+manager.address+" "+manager.phno+" "+manager.salary+" "+manager.specilization+" "+manager.department);
		Employee employee =new Employee();
		employee.age=25;
		employee.name="Dubey";
		employee.address="HYD";
	    employee.salary=29.564;
		employee.phno=144456789;
		employee.department="Employee";
		employee.specilization="Java Developer";
		System.out.println(employee.name+" "+ employee.age+" "+employee.address+" "+employee.phno+" "+employee.salary+" "+employee.specilization+" "+employee.department);
		
	}

	
	
	
}
