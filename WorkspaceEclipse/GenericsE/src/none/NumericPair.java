package none;

public class NumericPair<N extends Number> extends IdenticalPair<N> {
	
	public NumericPair( N first, N second) {
		super(first, second);
	}
	
	public double sum() {
		return super.getFirst().doubleValue() + super.getSecond().doubleValue();
	}

}
