package katas.extraFactorial;

import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void extraLongFactorials(int n) {

    }

    public static BigInteger calculateFactorial(int number){
        BigInteger factorialToCalculate = BigInteger.valueOf(number);
        BigInteger numberIterations = BigInteger.valueOf(number-1);
        while(BigInteger.ONE.compareTo(numberIterations) <= -1){
            factorialToCalculate = factorialToCalculate.multiply(numberIterations);
            numberIterations = numberIterations.add(BigInteger.valueOf(-1));
        }

        return factorialToCalculate;
    }

}
