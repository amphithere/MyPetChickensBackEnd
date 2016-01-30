package coops;

import java.awt.Point;

import Chickens.Chicken;
import Chickens.NormalChicken;

/**
 * Where you can breed your chickens
 * @author lisazhang
 *
 */
public abstract class Coop {
	protected int comfortLevel;
	protected Point location;
	
	public Coop(Point location){
		this.location = location;
		setComfortLevel();
		
	}
	
	public abstract void setComfortLevel();
	public Point getLocation(){
		return location;
	}
	public NormalChicken breedChickens(Chicken mom, Chicken dad){
		return new NormalChicken(mom, dad);
	}
}
