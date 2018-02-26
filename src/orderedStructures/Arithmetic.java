package orderedStructures;

public class Arithmetic extends Progression {
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

}
