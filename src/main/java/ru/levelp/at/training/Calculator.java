package ru.levelp.at.training;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int divie(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("b cannot be 0");
        }
        return a / b;
    }

    public int power(int a, int b){
        if (b < 0){
            throw new IllegalArgumentException("b cannot be negative");
        }

        int result = 1;

        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }
}
