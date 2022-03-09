package com.lamda;

public class CalculationMain {

    public static void main(String[] args) {
	Calci add = (a, b) -> System.out.println("Addition : " + (a + b));
	add.calculation(10, 20);
	Calci sub = (a, b) -> System.out.println("subtraction : " + (a - b));
	sub.calculation(10, 20);
	Calci mul = (a, b) -> System.out.println("Multiplication : " + (a * b));
	mul.calculation(10, 20);
	Calci div = (a, b) -> System.out.println("Division : " + (a / b));
	div.calculation(100, 20);
    }

}
