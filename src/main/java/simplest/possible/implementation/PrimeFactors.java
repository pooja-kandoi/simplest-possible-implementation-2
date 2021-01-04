package simplest.possible.implementation;


import java.util.ArrayList;
import java.util.List;

import static com.google.common.math.IntMath.isPrime;

public class PrimeFactors {
    List<Integer> Factors;

    public PrimeFactors(){
        Factors= new ArrayList<Integer>();
    }

    public  List<Integer> of(int i) {
        if(i==1){
            return Factors;
        }
        for(int num=2;num<=i;num++){
            if(isPrime(num) && i%num==0){
                Factors.add(num);
            }
        }
        return Factors;
    }
}
