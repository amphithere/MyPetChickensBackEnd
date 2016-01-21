package feed;

public abstract class Food {
	protected int feedValue;
	
	public Food(){
		setFeedValue();
	}
	
	public abstract void setFeedValue();
	
	public int getFeedValue(){
		return feedValue;
	}
}
