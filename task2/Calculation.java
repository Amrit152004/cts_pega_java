package task2;

public class Calculation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=125;
		int number2=24;
		System.out.println("Addition of two number"+add(number1,number2));
		System.out.println("Multiplication of two numner"+multiply(number1,number2));
		System.out.println("Subtraction of two number"+subtract(number1,number2));
		System.out.println("Division of two number"+divide(number1,number2));
		System.out.println("Modulus of two number"+remainder(number1,number2));
		

	}

	private static int remainder(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1%number2;
		
	}

	private static int divide(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1/number2;
		
	}

	private static int subtract(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1-number2;
		
	}

	private static int multiply(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1*number2;
		
	}

	private static int add(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1+number2;
		
	}

}
