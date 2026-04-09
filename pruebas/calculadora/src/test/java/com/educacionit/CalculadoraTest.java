package com.educacionit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(2, 3, '+');
        assertEquals(5, resultado);
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(8, 3, '-');
        assertEquals(5, resultado);
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(4, 2, '*');
        assertEquals(8, resultado);
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(10, 2, '/');
        assertEquals(5, resultado);
    }

    @Test
    public void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calc.calcular(10, 0, '/');
        });
    }

    @Test
    public void testOperadorInvalido() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcular(10, 5, '%');
        });
    }
}
