package model;

import java.util.Random;

import feed.Food;

public class Chicken {
	private int maxAge;
	private int age;
	private int hunger;
	private Chicken mom;
	private Chicken dad;
	private Genetics genetics;
	
	public Chicken(Chicken mom, Chicken dad) {
		this.age = 0;
		this.hunger = 5;
		this.mom = mom;
		this.dad = dad;
		this.maxAge = 14;
		this.genetics = new Genetics(mom.getGenetics().getGenes(), dad.getGenetics().getGenes() );
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
		maxAge-=5;
	}
}
