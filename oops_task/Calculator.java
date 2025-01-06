package oops_task;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public double add(double a,double b) {
	return a+b;}
	public double mul(double a,double b) {
		return a*b;
	}
	public double div(double a,double b) {
		return a/b;
	}
	public double add(int a,double b) {
		return a+b;
	}
	public double mul(int a,double b) {
		return a*b;
	}
	public double div(int a,double b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculatoer=new Calculator();
		
		System.out.println(calculatoer.add(2, 2.3));

	}

}
