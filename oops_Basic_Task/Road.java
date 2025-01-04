package oops_Basic_Task;

 class Vehicle {
	public void start() {
		System.out.println("Vehicle Startd");
	}

}
class Truck extends Vehicle{
	public void start() {
		super.start();
		System.out.println("Truck started");
	}
}
class Car extends Vehicle{
	public void start() {
	super.start();
		System.out.println("Car started");
	}
}
public class Road{
	public static void main(String[] args) {
		Car car=new Car();
		car.start();
		Truck truck = new Truck();
		truck.start();
		Vehicle vehicle=new Vehicle();
		vehicle.start();
		
	}
}
