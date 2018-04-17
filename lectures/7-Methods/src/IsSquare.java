import acm.program.ConsoleProgram;

public class IsSquare extends ConsoleProgram {

	public void run() {
		for(int i = 1; i <= 100; i++) {
			if(isSquare(i)) {
				println(i);
			}
		}
	}

	private boolean isSquare(int x) {
		double root = Math.sqrt(x);
		return root == (int)(root);
	}

}
