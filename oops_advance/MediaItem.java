package oops_advance;

public abstract class MediaItem extends Item{

	public MediaItem(int identification_Number, String title, int number_Of_Copies) {
		super(identification_Number, title, number_Of_Copies);
		// TODO Auto-generated constructor stub
	}
	private int runtime;
	public abstract String checkIntMediaItem();

}
