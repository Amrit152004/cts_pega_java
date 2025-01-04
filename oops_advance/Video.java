package oops_advance;

public class Video extends MediaItem {

	public Video(int identification_Number, String title, int number_Of_Copies) {
		super(identification_Number, title, number_Of_Copies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String checkIntMediaItem() {
		// TODO Auto-generated method stub
		return "Hello we are from  Video class and also acquirng Media item";
	}

	@Override
	public String checkIn() {
		// TODO Auto-generated method stub
		return "Hello we are from  Video class check in and also acquirng  item";
	}

	@Override
	public String checkOut() {
		// TODO Auto-generated method stub
		return "Hello we are from  Video class check out and also acquirng Media item";
	}

}
