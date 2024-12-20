package none;
import java.util.Arrays;



//Dynamic Programming OPTIMIZED CODE
public class Quadratwurzel {
	public static int n=5000;
	public static double [] dpArray= new double [n+1];
	

	
	
	public static double quadratwurzel(double x, double n) {
		if(n==0) return (x+1)/2.0;
		if(dpArray[(int) n-1]!=0) {
			
			System.out.println("used");
			
			
			dpArray[(int) n]=0.5*(dpArray[(int) n-1] + (x/dpArray[(int) n-1]));
			
			return 0.5*(dpArray[(int) n-1] + (x/dpArray[(int) n-1]));
		}else {
		dpArray[(int) n] = 0.5*(quadratwurzel(x, n-1) + (x/quadratwurzel(x, n-1)));
		
		return dpArray[(int) n];
		}
	}
	

	public static void main(String[] args) {
		double numToCalculate=3.0;
		
		Arrays.fill(dpArray, 0);
		dpArray[0]= (numToCalculate +1 ) / 2;
		// TODO Auto-generated method stub
		System.out.print(quadratwurzel(numToCalculate, 5000.0));
	}

}
