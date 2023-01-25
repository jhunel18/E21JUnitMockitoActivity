package org.example;


public class AdvancedMath {
    private BasicMath basicMath;
    public double multiplySumBy5(double input1, double input2) {
        return basicMath.multiply(basicMath.add(input1, input2), 5); //1 call
    }
    public double squareOfSum(double input1, double input2) {
        return basicMath.add(input1, input2) * basicMath.add(input1, input2); //2 calls
    }
    public double multiplyDifferenceBy5(double input1, double input2) {
        return basicMath.subtract(input1, input2) * 5; //1 call
    }
    public double getPercentage(double input1, double input2) {
        return basicMath.divide(input1, input2) * 100; //1 call
    }
}

