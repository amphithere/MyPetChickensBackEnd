package model;

public class Egg extends Chicken{
	private int incubationDay;
	private ChickenTree tree;
	private boolean deformed;
	
	public Egg(Chicken dad, Chicken mom){
		this.incubationDay = 0;
		this.tree = new ChickenTree(dad, mom, this); // Think about inheritence and how you should implement the tree
	}
	
	private void hatch(){
		// hatch stuff
	}
	
	public void incubate(){
		incubationDay+=10;
		if(incubationDay >= Dates.HATCH_DAY.getValue()){
			hatch();
		}
	}
	
}
