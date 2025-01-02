package task2;

public class SumOfSquare {
	public static int sumOfSquare(int n) {
		int sum=0;
		int sumOfNaturalNumber=(n*(n+1))/2;
		int squareOfSum=sumOfNaturalNumber*sumOfNaturalNumber;
		for(int i=1;i<=n;i++) {
			int local=i*i;
			sum+=local;
		}
		return sum-squareOfSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfSquare(10));

	}

}
