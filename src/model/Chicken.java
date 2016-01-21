package model;

import java.util.Random;

import feed.Food;

public class Chicken {
	private Random r = new Random();
	private int age;
	private int hunger;
	private int gender;
	private boolean dead;
	private Genetics genes;
	
	public Chicken(){
		this.age = 0;
		this.hunger = 5;
		this.gender = r.nextInt(1);
	}
	
	public void die(){
		this.dead = true;
	}
	
	public void ageChicken(){
		age++;
	}
	public void feed(Food food){
		hunger += food.getFeedValue();
	}
	public int getAge(){
		return age;
	}
	
	public Genetics getGenetic(){
		return genes;
	}
	
	public int getHunger(){
		return hunger;
	}
}
