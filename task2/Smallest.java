package task2;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=25;
		int num2=3;
		int num3=20;
		System.out.println(smallest(num1,num2,num3));

	}

	private static int smallest(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if(num1<num2 && num1<num3) {
			return num1;
		}
		else if(num2<num1 && num2<num3) {
			return num2;
		}
		else {
			return num3;
		}
	
	}

}
