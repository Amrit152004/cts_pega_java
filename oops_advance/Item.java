package oops_advance;

public abstract class Item {
	private int Identification_Number;
	private String title;
	private int  number_Of_Copies;
	public int getIdentification_Number() {
		return Identification_Number;
	}
	public void setIdentification_Number(int identification_Number) {
		Identification_Number = identification_Number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_Of_Copies() {
		return number_Of_Copies;
	}
	public void setNumber_Of_Copies(int number_Of_Copies) {
		this.number_Of_Copies = number_Of_Copies;
	}
	@Override
	public String toString() {
		return "Item [Identification_Number=" + Identification_Number + ", title=" + title + ", number_Of_Copies="
				+ number_Of_Copies + "]";
	}
	public Item(int identification_Number, String title, int number_Of_Copies) {
		super();
		Identification_Number = identification_Number;
		this.title = title;
		this.number_Of_Copies = number_Of_Copies;
	}
	public  abstract String checkIn();
	public abstract String checkOut();
	
	

}
