package com.educacionit;

public class Calculadora {

    public double calcular(double a, double b, char operador) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador no válido");
        }
    }
}
