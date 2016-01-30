package model;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.Timer;

import Chickens.Chicken;
import coops.BasicCoop;
import coops.Coop;

public class Game extends Observable{
	private ArrayList<Chicken> chickens;
	private ArrayList<Coop> coops;
	private Timer wheelOfTime;

	public Game(){
		this.chickens = new ArrayList<Chicken>();
		this.coops = new ArrayList<Coop>();
		testingAddCoop(new Point(1,1));
		wheelOfTime = new Timer(1000, new TimerActionListener());
		wheelOfTime.start();
	}

	private class TimerActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < chickens.size(); i++){
				if (chickens.get(i).getHunger() <= 0 || chickens.get(i).getAge() >= chickens.get(i).getMaxAge()){
					killChicken(chickens.get(i));
				}
				else {
					chickens.get(i).ageChicken();
				}
			}
			for (Chicken c: chickens){
				c.move();
			}
			setChanged();
			notifyObservers();
		}
	}
	/**
	 * If Chicken's hunger goes to 0, it dies.
	 * Put in loop or Timer
	 */
	
	public void testingAddChickens(Chicken chicken){
		chickens.add(chicken);
	}
	
	public void testingAddCoop(Point location){
		coops.add(new BasicCoop(location));
	}
	
	private void killChicken(Chicken chicken){
		chickens.remove(chicken);
	}

	public ArrayList<Chicken> getChickens() {
		return chickens;
	}

	public ArrayList<Coop> getCoop(){
		return coops;
	}

}
