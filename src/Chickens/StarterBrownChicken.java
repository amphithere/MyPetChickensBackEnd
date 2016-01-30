package Chickens;

import model.Genes;
import model.Genetics;

public class StarterBrownChicken extends Chicken{

	public StarterBrownChicken(Chicken mom, Chicken dad) {
		super(mom, dad);
		this.genetics = new Genetics(new Genes(1,1), new Genes(1,1));
		setName("Wilma");
		setGender(0);
	}

}
