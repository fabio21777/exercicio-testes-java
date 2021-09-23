package entities.factory;

import entities.Financing;

public class FinancingFactory {
	public static Financing  createEmptyFinancing() {
		Financing financing = new Financing(0.0, 0.0,0);
		return(financing);
		
	}
	public static Financing createFinancing(double totalAmount, double income, int months) {
		Financing financing = new Financing(totalAmount, income,months);
		return(financing);
	}
	
}
