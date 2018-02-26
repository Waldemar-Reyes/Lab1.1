package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString() {
		String words = "Geom(" + (int)this.firstValue() + ", " + (int)commonFactor + ")";
		return words;
	}
	
	@Override
	public double getTerm(int n) {
		double value = this.firstValue() + Math.pow(commonFactor, n-1);
		return value;
	}

}
