package Chickens;

import model.Genes;
import model.Genetics;

public class StarterWhiteChicken extends Chicken{

	public StarterWhiteChicken(Chicken mom, Chicken dad) {
		super(mom, dad);
		this.genetics = new Genetics(new Genes(0,0), new Genes(0,0));
		setName("Zeus");
		setGender(1);
	}

}
