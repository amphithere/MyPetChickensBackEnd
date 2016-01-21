package coops;

import model.Chicken;

/**
 * Where you can breed your chickens
 * @author lisazhang
 *
 */
public abstract class Coop {
	protected int comfortLevel;
	public Coop(){
		setComfortLevel();
		
	}
	
	public abstract void setComfortLevel();
	
	public void breedChickens(Chicken mom, Chicken dad){
		// ChickenTree
		// Genetics
	}
}
