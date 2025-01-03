package task1;

public class Variable_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		classname:Variables_Example1 
//		variableNames:
//					number1,number2,number3,result,average,sum_result,mul_result
//					
//		i)Sample Input :number1=12,number2=13,number3=11
//		  Sample Output:sum of three numbers is :36 	(12+13+11)
//						average of three numbers is :36    36/3=12
//						sub of three numbers is :-12		(12-13-11)	
//						multiplication of three numbers is :1716
		
		int number1=12;
		int number2=13;
		int number3=11;
		int result=number1+number2+number3;
		System.out.println(result+" Result of addition");
		float average=result/3;
		System.out.println(average+" Average of total");
		int sub_result=number1-number2-number3;
		System.out.println(sub_result+" Subtract of toatal");
		int mul_result=number1*number2*number3;
		System.out.println(mul_result+" Multiplication of all the records");
		

	}

}
