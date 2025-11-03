// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0]; // name ron
		String name2 = args[1]; // mame lisa
		String name3 = args[2]; // name dan
		double b = Double.parseDouble(args[3]); // bill
		
	    double X = b / 3;
		X = Math.ceil(X);
		System.out.println("Dear " + args[2] + ", " + args[1] +
		 ", and " + args[0] + ": pay " + X + " Shekels each");

	}

}
