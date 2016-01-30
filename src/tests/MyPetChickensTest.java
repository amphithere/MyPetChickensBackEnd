package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Chicken;
import model.Genes;
import model.Genetics;

public class MyPetChickensTest {
	@Test
	public void testGenes(){
		Genes genes = new Genes(1, 0);
		assertEquals(1, genes.getFirstAllele());
		assertEquals(0, genes.getSecondAllele());
	}
	
	@Test
	public void testGenetics(){
		Genes momG = new Genes(0, 0);
		Genes dadG = new Genes(1, 1);
		Chicken mom = new Chicken(null, null);
		Chicken dad = new Chicken(null, null);
		Genetics genetics = new Genetics(momG, dadG);
	}
}
