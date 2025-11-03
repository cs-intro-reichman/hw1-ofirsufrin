// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		int H = N / 100; // hundreds 
		int T = (N - (H * 100)) / 10; // tens
		int O = N - ((T * 10) + (H * 100)); // ones
		System.out.println(H + " hundreds " + T + " tens, and " + O + " ones.");

		}
}
