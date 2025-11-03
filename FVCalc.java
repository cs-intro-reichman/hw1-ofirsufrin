// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
	int CV = Integer.parseInt(args[0]); // name currentValue
	double rateInput = Double.parseDouble(args[1]);
	double R = rateInput / 100;
	int N = Integer.parseInt(args[2]); // input year
	
	// the nuber of the hezka
	double H = 1 + R; // hishuv shel helek mehazka
	double X = Math.pow(H,N);
	double FV = CV * X; // hishuv nusha
	System.out.println("After " + N + " years, $" + CV + " saved at " +
	rateInput +"% will yield " + "$" + ((int)FV));	

	}
}