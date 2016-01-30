package model;

import java.util.Random;

import Chickens.Chicken;

public class Egg {
	private int incubationDay;
	private boolean dead;

	
	public Egg(Chicken dad, Chicken mom){
		this.incubationDay = 0;
	}
	
	private void hatch(){
		
	}
	
	
	
	/**
	 * Kills the chicken
	 */
	public void die(){
		this.dead = true;
	}
	
//	/**
//	 * 
//	 * @return chicken genetics
//	 */
//	public Genetics getGenetic(){
//		return genes;
//	}
	
	public void incubate(){
		incubationDay+=10;
		if(incubationDay >= Dates.HATCH_DAY.getValue()){
			hatch();
		}
	}
	
}
