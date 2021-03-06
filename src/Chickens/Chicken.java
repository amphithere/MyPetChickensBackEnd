package Chickens;

import java.awt.Point;
import java.util.Random;

import feed.Food;
import model.Genetics;

public abstract class Chicken {
	protected String name;
	protected int maxAge;
	protected int age;
	protected int hunger;
	protected Chicken mom;
	protected Chicken dad;
	protected Genetics genetics;
	protected int gender;
	private Point location;
	private Random r;
	
	public Chicken(Chicken mom, Chicken dad) {
		this.age = 0;
		this.hunger = 5;
		this.mom = mom;
		this.dad = dad;
		this.maxAge = 600;
		this.r = new Random();
		this.gender = r.nextInt(1);
		location = new Point(1,1);
		setGenetics();
	}
	
	public void move(){
		int newLocation = r.nextInt(4);
		if(newLocation == 0){
		   location.x = (location.x + 1 + 13) %13;
		}
		if(newLocation == 1){
			location.x = (location.x - 1 + 13) %13;
		}
		if(newLocation == 2){
			location.y = (location.y + 1 + 11) %11;
		}
		if(newLocation == 3){
			location.y = (location.y - 1+11) %11;
		}
	}
	
	public void setLocation(Point p){
		location = p;
	}
	
	public Point getLocation(){
		return location;
	}
	
	public void setGenetics(){
		if(mom != null & dad != null){
			this.genetics = new Genetics(mom.getGenetics().getGenes(), dad.getGenetics().getGenes());
		}
		else {
			// Do nothing
		}
	}
	
	public String getGender(){
		if (gender == 0){
			return "Female";
		}
		else {
			return "Male";
		}
	}
	
	public void setGender(int gen){
		gender = gen;
	}
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Ages the chicken by one year
	 */
	public void ageChicken(){
		age++;
	}
	
	/**
	 * Checks for sibling
	 * @param chicken
	 * @return boolean
	 */
	public boolean isSibling(Chicken chicken){
		if (chicken.getMom() == mom || chicken.getDad() == dad){
			return true;
		}
		else {
			return false;
		}
	}
	
	public Chicken getMom(){
		return mom;
	}
	
	public Chicken getDad(){
		return dad;
	}
	/**
	 * Feeds the chicken
	 * @param food
	 */
	public void feed(Food food){
		hunger += food.getFeedValue();
	}
	
	/**
	 * Returns the age of the chicken
	 * @return chicken age
	 */
	public int getAge(){
		return age;
	}
	
	
	/**
	 * 
	 * @return chicken hunger level
	 */
	public int getHunger(){
		return hunger;
	}
	public Genetics getGenetics(){
		return genetics;
	}
	
	public void deformed(){
		maxAge-=300;
	}
	
	public int getMaxAge(){
		return maxAge;
	}
}
