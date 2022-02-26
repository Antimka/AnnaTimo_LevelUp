package ru.levelp.at.training;

public class Application {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("sum 2 + 2 = " + calculator.sum(2,2));
        System.out.println("==============");
        System.out.println(String.format("substract 4 - 5 = %d", calculator.substract(4, 5)));
        System.out.println("==============");
        System.out.println(String.format("2 in 7 power is %d", calculator.power(2, 7)));
    }

}
