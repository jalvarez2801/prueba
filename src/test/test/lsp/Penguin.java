package test.test.lsp;

public class Penguin implements Bird {
	@Override
	public void fly() {
		throw new UnsupportedOperationException("I can't fly.");
	}
}