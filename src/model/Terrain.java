package model;

public enum Terrain {
	GRASS(0),
	DIRT(1),
	ROCKS(2);
	
	private int value;
	
	private Terrain(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
