package model;

import java.util.ArrayList;

public class Game {
	private ArrayList<Chicken> chickens;
	public Game(){
		this.chickens = new ArrayList<Chicken>();
	}
	
	/**
	 * If Chicken's hunger goes to 0, it dies.
	 * Put in loop or Timer
	 */
	private void checkChickens(){
		for(Chicken i: chickens){
			if(i.getHunger() == 0){
				i.die();
				chickens.remove(i); // Make sure that works, feel like it'd cause an error because it's 
				// concurrent modifying
			}
		}
	}
}
