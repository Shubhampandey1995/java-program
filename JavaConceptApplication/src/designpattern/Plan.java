package designpattern;

public abstract class Plan {
	
	protected double rate;
	
	abstract void getRate();
	
	public void calculationBill(int units) {

		System.out.println(units * rate);
		
	}

}
