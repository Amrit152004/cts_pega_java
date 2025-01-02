package task2;

public class Employee {
	//e empid, empname, empsal, empAdd, empGender, empEmail and display
	private static  int empid;
	private static String empname;
	private static  float empsal;
	private static  String empAdd;
	private static  char empGender;
	private static  String empEmail;
	
	

	public Employee(int empid, String empname, float empsal, String empAdd, char string, String empEmail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empAdd = empAdd;
		this.empGender = string;
		this.empEmail = empEmail;
	}
	private static void display() {
		System.out.println(empid+" "+empname+" "+empsal+" "+empAdd+" "+empGender+" "+empEmail);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"Kumar",18600.23f,"HYD",'M',"kumar@gmail.com");
		emp.display();

	}

}
