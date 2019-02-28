package edu.dmacc.codedsm.hw7;

public class SumHundred {
    public static void main(String[] args) {

        int result = 0;
        int count = 0;
        while (result < 100) {

            result = sumThreeIntegers(3, 5, result);

            count++;

        }
        output(result, count);


    }

    public static int sumThreeIntegers(int firstInput, int secondInput, int priorResult) {
        return firstInput + secondInput + priorResult;
    }

    public static void output(int finalResult, int iterations) {

        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " to complete");
    }
}
