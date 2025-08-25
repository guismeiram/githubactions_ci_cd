package com.example.demo.Aula02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * Classe de testes unitários para a classe Calculator.
 * Verifica o comportamento correto dos métodos de cálculo.
 */
public class CalculatorTest {
    /**
     * Testa a função de adição com valores positivos.
     * Verifica se 2 + 2 resulta em 4.
     */
    @Test
    public void testAdd() {

        assertEquals(4, Calculator.add(2, 2));
    }

    /**
     * Testa a função de subtração com valores positivos.
     * Verifica se 3 - 2 resulta em 1.
     */
    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }


}
