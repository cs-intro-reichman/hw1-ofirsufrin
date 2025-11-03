// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int L = Integer.parseInt(args[0]);
		int Min = 1;
		int Max = Integer.parseInt(args[0]);
		int A = (int) (Min + (Max - Min + 1) * Math.random());
		int B = (int) (Min + (Max - Min + 1) * Math.random());
		int C = (int) (Min + (Max - Min + 1) * Math.random());
		
		int M1 = Math.min(A, B); // Minimum a-b
		int M2 = Math.min(B, C); // minimum b-c
		int M3 = Math.min(M1, M2); // the most min
		int MM1 = Math.max(A, B); // maximum a-b
		int MM2 = Math.max(B, C); // maximum b-c
		int MM3 = Math.max(MM1, MM2); //the most max
		int Mid = A + B + C - M3 - MM3; //find the middle

		System.out.println(A + " " + B + " " + C);
		System.out.println(M3 + " " + Mid + " " + MM3);

		// Replace this comment with your code
	}
}
