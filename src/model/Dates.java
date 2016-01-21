package model;

public enum Dates {
	HATCH_DAY(21),
	BREEDING_AGE(2),
	DEATH_AGE(14);
	
	private int value;
	
	private Dates(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
