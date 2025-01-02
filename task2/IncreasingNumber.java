package task2;

public class IncreasingNumber {
	public static boolean increasing(int n) {
		int high=Integer.MAX_VALUE;
		//System.out.println(high);
		while(n!=0) {
			int rem=n%10;
			//System.out.println(rem);
			if(rem>high) {
				return false;
			}
			else {
				high=rem;
			}
			//System.out.println(high+"High");
			n=n/10;
			//System.out.println(n);
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=134068;
		boolean result = increasing(n);
		System.out.println(result);
		System.out.println(1%2);

	}

}
