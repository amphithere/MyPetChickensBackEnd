package coops;

import Chickens.Chicken;
import Chickens.NormalChicken;

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
	
	public NormalChicken breedChickens(Chicken mom, Chicken dad){
		return new NormalChicken(mom, dad);
	}
}
