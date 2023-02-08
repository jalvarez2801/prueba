package test.test.lsp;

public class Main {
	public static void main(String[] args) {
		Bird[] birds = { new Eagle(), new Penguin() };

		for (Bird bird : birds) {
			try {
				bird.fly();
			} catch (UnsupportedOperationException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
