package none;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.primes.*;

public class PrimeTesterApplication {
	
	static public List<Integer> getCommonPrimeFactors(int a, int b){
		
        List<Integer> primeFactorsb = Primes.primeFactors(b);
        List<Integer> primeFactorsa = Primes.primeFactors(a);
        
		 
		 List<Integer> primeFactors = new ArrayList<>();
		 
		 for(int i=0; i < primeFactorsb.size(); ++i) {
			 for(int j=0; j<primeFactorsa.size(); ++j) {
				 if(primeFactorsb.get(i).equals(primeFactorsa.get(j)) ) {
					 primeFactors.add(primeFactorsb.get(j));
					 primeFactorsa.remove(j);
					 break;
				 }
					 
			 }
		 }
		 primeFactors.sort((n, p)-> a-b);
		 
		 for(int i=0; i<primeFactors.size(); i++) {
			 if(i+1<primeFactors.size() &&primeFactors.get(i).equals(primeFactors.get(i+1)) ) {
				 primeFactors.remove(i);
				 i=-1;
			 }
		 }
		 
		
		 

		 return primeFactors;
	}

	public static void main(String[] args) {
		List<Integer> output = getCommonPrimeFactors(8,8);
		
		output.stream().forEach(a->System.out.println(a));

	}

}