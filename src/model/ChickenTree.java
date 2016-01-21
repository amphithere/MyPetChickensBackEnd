package model;

public class ChickenTree {
	private Chicken mom;
	private Chicken dad;
	private Chicken self;
	
	public ChickenTree(Chicken dad, Chicken mom, Chicken self){
		this.dad = dad;
		this.mom = mom;
		this.self = self;
	}
	
	/**
	 * Checks for inbred offspring, will either hatch with deformities
	 * or will not hatch.
	 */
	private void checkLineage(){
		
	}
}
