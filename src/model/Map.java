package model;
import java.util.Observable;
import java.util.Random;

public class Map {
	private int[][] area;
	private int size;
	private Random r;
	public Map(int size){
		this.size = size;
		area = new int[size][size];
		r = new Random();
		setUpMap();
	}
	
	// Find a better way to generate terrain
	private void setUpMap(){
		for(int row = 0; row < size; row++){
			for(int column = 0; column < size; column++){
				// Double check random function 
				area[row][column] = r.nextInt(size); // generate terrain randomly
			}
		}
	}
	
	private void generateTerrain(){
		
	}
	
	public void setArea(int n){
		this.size = n;
		area = new int[size][size];
	}
	
	public int getSize(){
		return size;
	}
}
