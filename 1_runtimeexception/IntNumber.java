public class IntNumber {
	private int value;
	public IntNumber(int initValue) {
		this.value = initValue;
	}
	public boolean isZero() {
		return value == 0;
	}
	public IntNumber div(IntNumber that) {
		if (that.isZero())
			throw new DivByZeroRuntimeException();

		return new IntNumber(this.value / that.value);
	}
	public String toString() {
		return Integer.toString(value);
	}
}

