package task2;

public class CalculateSum {
	public static  int sumOfNaturalNumber(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(sumOfNaturalNumber(n));

	}

}
