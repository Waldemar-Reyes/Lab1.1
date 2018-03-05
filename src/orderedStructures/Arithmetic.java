package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference;
		firstValueTrue = false;
	}
	
	@Override
	public double nextValue() {
		if (!firstValueTrue) 
			throw new IllegalStateException("nextValue() invalid since firstValue() have not been executed.");
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString() {
		String words = "Arith(" + (int)this.firstValue() + ", " + (int)commonDifference + ")";
		return words;
	}
	
	@Override
	public double getTerm(int n) {
		double value = this.firstValue() + commonDifference * (n-1);
		return value;
	}

	@Override
	public Progression add(Progression p) {
		p = new Arithmetic( ((Arithmetic)p).firstValue() + this.firstValue(), ((Arithmetic)p).commonDifference + this.commonDifference );
		return p;
	}

	@Override
	public Progression substract(Progression p) {
		p = new Arithmetic( ((Arithmetic)p).firstValue() - this.firstValue(), Math.abs(((Arithmetic)p).commonDifference - this.commonDifference));
		return p;
	}

}
