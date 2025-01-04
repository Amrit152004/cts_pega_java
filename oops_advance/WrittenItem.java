package oops_advance;

public abstract class WrittenItem extends Item {

	public WrittenItem(int identification_Number, String title, int number_Of_Copies) {
		super(identification_Number, title, number_Of_Copies);
		// TODO Auto-generated constructor stub
	}
	private String author;
	public abstract String checkInWrittenItem();
	

}
