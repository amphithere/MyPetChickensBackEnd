package model;

import java.util.ArrayList;
import java.util.Observable;

import Chickens.Chicken;
import coops.Coop;

public class Game extends Observable{
	private ArrayList<Chicken> chickens;
	private ArrayList<Coop> coops;
	
	public Game(){
		this.chickens = new ArrayList<Chicken>();
	}
	
	/**
	 * If Chicken's hunger goes to 0, it dies.
	 * Put in loop or Timer
	 */
	private void killChicken(Chicken chicken){
		// TODO
	}

	public ArrayList<Chicken> getChickens() {
		return chickens;
	}
	
}
