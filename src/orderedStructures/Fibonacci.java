package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0;
		firstValueTrue = false;
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		if (!firstValueTrue) 
			throw new IllegalStateException("nextValue() invalid since firstValue() have not been executed.");
		current = current + prev;
        prev = current - prev;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
