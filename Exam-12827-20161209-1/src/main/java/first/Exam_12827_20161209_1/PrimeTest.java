package first.Exam_12827_20161209_1;

import java.util.ArrayList;
import java.util.List;

public class PrimeTest {
	 public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        int primeNumber = 0;
        for(int i = 101 ;i <= 200;i++){
            boolean isPrime=true;
            for(int j=i-1;j>1;j--){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
            	primes.add(i);
                primeNumber++;
            }    
        }
        System.out.println("101-200间共有"+primeNumber+"个素数,分别是");
        System.out.println(primes);
    }
}

