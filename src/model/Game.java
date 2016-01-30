package model;

import java.util.ArrayList;
import java.util.Observable;

public class Game extends Observable{
	private ArrayList<Chicken> chickens;
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
	
}
