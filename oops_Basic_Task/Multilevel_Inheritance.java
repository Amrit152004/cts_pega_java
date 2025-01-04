package oops_Basic_Task;
class Grandfather{
	public void advice() {
		System.out.println("Grandfather's Advice");
	}
}
class Father extends Grandfather{
	public void advice() {
		super.advice();
		System.out.println("Father's Advice");
		
	}
}
class Child extends Father{
	public void advice() {
		super.advice();
		System.out.println("Child's Advice");
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.advice();

	}

}
