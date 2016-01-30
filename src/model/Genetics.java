package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Used for determining genetics traits of the chicken
 * @author lisazhang
 *
 */

/* Legend
 * 0 = white recessive
 * 1 = brown dominant
 */

public class Genetics {
	private Genes momGenes;
	private Genes dadGenes;
	private ArrayList<Genes> potentialGenes;
	private Random r;
	private Genes genes;
	private String color;
	
	public Genetics(Genes momGenes, Genes dadGenes) {
		this.momGenes = momGenes;
		this.dadGenes = dadGenes;
		this.potentialGenes = new ArrayList<Genes>();
		createGenePossibilities();
		r = new Random();
		chooseGenes();
	}
	public void setGenetics(int allele1, int allele2){
		genes = new Genes(allele1, allele2);
	}
	
	// Gathering all the gene possiblities from genes from mom and dad chicken
	private void createGenePossibilities(){
		for (Integer m: momGenes.getGenes()){
			for(Integer d: dadGenes.getGenes()){
				potentialGenes.add(new Genes(m, d));
			}
		}
	}
	
	// Randomly chooses gene from potential genes
	private void chooseGenes(){
		int random = r.nextInt(potentialGenes.size());
		genes = potentialGenes.get(random);
		
	}
	
	public Genes getGenes(){
		return genes;
	}
	
	public ArrayList<Genes> getGenePossibilities(){
		return potentialGenes;
	}
	
	// Will determine the color of the chicken from the genes given
	public String getColor(){
		for (Integer g: genes.getGenes()){
			if (g.equals(1)){
				color = "Brown";
				break;
			}
			else {
				color = "White";
			}
		}
		return color;
	}
	
}


