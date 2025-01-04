package oops_advance;

public class Book extends WrittenItem {

	public Book(int identification_Number, String title, int number_Of_Copies) {
		super(identification_Number, title, number_Of_Copies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String checkIn() {
		// TODO Auto-generated method stub
		return "Hello we are in Book class and also acquiring Check in method of item";
	}

	@Override
	public String checkOut() {
		// TODO Auto-generated method stub
		return "Hello we are in Book class and also acquiring Check out method of item";
	}

	@Override
	public String checkInWrittenItem() {
		// TODO Auto-generated method stub
		return "Hello we are in Book from WrittenItem abstract class";
	}
	

}
