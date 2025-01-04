package oops_Basic_Task;
class father{
	public void manner() {
		System.out.println("Respect the elder");
	}
}
class child extends father{
	public void extended_manner() {
		
		System.out.println("Follow thw elder's advice");
		manner();
	}
}

public class Single_Inheritance {
	public static void main(String[] args) {
		child baby=new child();
		baby.extended_manner();
	}
	

}
