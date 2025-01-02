package task2;

public class PowerOfTwo {
	public static boolean powerOfTwo(int n) {
	while(n!=1) {
		int rem=n%2;
		int quo=n/2;
		//System.out.println(rem+" "+quo);
		if(rem==0) {
			n=n/2;
		}else {
			return false;
		}
	}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=32;
		boolean powerOfTwo = powerOfTwo(n);
		System.out.println(powerOfTwo);
		//System.out.println(Math.sqrt());

	}

}
