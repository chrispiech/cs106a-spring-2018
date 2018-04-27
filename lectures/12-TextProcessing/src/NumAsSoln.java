
import acm.program.*;

public class NumAsSoln extends ConsoleProgram {

	public void run() {
		setFont("Courier-24");
		String dna1 = "ATGCAA";
		String dna2 = "AAAAAG";
		
		println(dna1 + " num As:");
		println(getNumAs(dna1));
		
		println("");
		println(dna2 + " num As:");
		println(getNumAs(dna2));
		
	}

	private int getNumAs(String str) {
		int numAs = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'A') {
				numAs++;
			}
		}
		return numAs;
	}

	

}
