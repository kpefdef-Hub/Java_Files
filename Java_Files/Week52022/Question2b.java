package Week52022;

public class Question2b {
	//Author Adedapo Adeniyi
		//Date 09042022
		//BINS 5312 Assignment 1 Q 2
		//The Code intends to use Java to to write a Pyramid pattern
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("      TTT");
		for(int i = 0; i<6; i++) {
			System.out.println(builder);
			builder.delete(0, 1);
			builder.append("TT");
		}

	}

}
