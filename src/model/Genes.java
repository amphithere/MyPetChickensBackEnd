package model;

import java.util.ArrayList;

/* Legend
 * 0 = white recessive
 * 1 = brown dominant
 */
public class Genes {
	private int firstAllele;
	private int secondAllele;
	private ArrayList<Integer> genes;
	
	public Genes(int firstAllele, int secondAllele){
		this.firstAllele = firstAllele;
		this.secondAllele = secondAllele;
		this.genes = new ArrayList<Integer>();
		addGenes();
	}
	
	private void addGenes(){
		genes.add(firstAllele, secondAllele);
	}
	public int getFirstAllele(){
		return firstAllele;
	}
	
	public int getSecondAllele(){
		return secondAllele;
	}
	
	public ArrayList<Integer> getGenes(){
		return genes;
	}
	
}
