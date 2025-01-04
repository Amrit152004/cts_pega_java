package oops_advance;

import java.util.Date;

public class JournalPaper extends WrittenItem {
	public JournalPaper(int identification_Number, String title, int number_Of_Copies) {
		super(identification_Number, title, number_Of_Copies);
		// TODO Auto-generated constructor stub
	}

	private Date year;

	@Override
	public String checkIn() {
		// TODO Auto-generated method stub
		return "Hello we are in Journal papaer class and also acquiring Check in method of item";
	}

	@Override
	public String checkOut() {
		// TODO Auto-generated method stub
		return "Hello we are in Journal papaer class and also acquiring Check in method of item";
	}

	@Override
	public String checkInWrittenItem() {
		// TODO Auto-generated method stub
		return  "Hello we are in JournalPaper from WrittenItem abstract class";
	}
	

}
