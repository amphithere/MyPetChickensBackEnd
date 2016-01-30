package tests;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import Chickens.Chicken;
import Chickens.NormalChicken;
import Chickens.StarterBrownChicken;
import Chickens.StarterWhiteChicken;
import coops.BasicCoop;
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
		Genes momG = new Genes(1, 0);
		Genes dadG = new Genes(1, 1);
		Genetics genetics = new Genetics(momG, dadG);
		assertEquals("Brown", genetics.getColor());
	}
	
	@Test
	public void starterChickens(){
		StarterBrownChicken wilma = new StarterBrownChicken(null, null);
		StarterWhiteChicken zeus = new StarterWhiteChicken(null, null);
		assertEquals("Brown", wilma.getGenetics().getColor());
		assertEquals("White", zeus.getGenetics().getColor());
	}
	
	@Test
	public void coopBreedCheck(){
		BasicCoop basic = new BasicCoop(new Point(1,1));
		StarterBrownChicken wilma = new StarterBrownChicken(null, null);
		StarterWhiteChicken zeus = new StarterWhiteChicken(null, null);
		StarterWhiteChicken snow = new StarterWhiteChicken(null, null);
		NormalChicken childChicken = basic.breedChickens(wilma, zeus);
		assertEquals("Brown", childChicken.getGenetics().getColor());
		NormalChicken whiteChickenChild = basic.breedChickens(snow, zeus);
		assertEquals("White", whiteChickenChild.getGenetics().getColor());
	}
}
