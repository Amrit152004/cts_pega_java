package oops_advance;

public class CD extends MediaItem{

	public CD(int identification_Number, String title, int number_Of_Copies) {
		super(identification_Number, title, number_Of_Copies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String checkIntMediaItem() {
		// TODO Auto-generated method stub
		return"Hello we are from  CD class and also acquirng Media item";
	}

	@Override
	public String checkIn() {
		// TODO Auto-generated method stub
		return "Hello we are from  CD class checkIn and also acquirng  item";
	}

	@Override
	public String checkOut() {
		// TODO Auto-generated method stub
		return"Hello we are from  CD class checkout and also acquirng Media item";
	}
	public static void main(String[] args) {
		CD cd=new CD(001, "KGF", 22);
		//cd.checkIn();
		System.out.println(cd.checkIn());
		
	}

}
