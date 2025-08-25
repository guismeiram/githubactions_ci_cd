package com.example.demo.Aula02;

public class Calculator {
    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param a Primeiro operando (número a ser somado)
     * @param b Segundo operando (número a ser somado)
     * @return Resultado da soma a + b
     * @throws ArithmeticException Se ocorrer overflow na operação
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a Minuendo (número a ser subtraído)
     * @param b Subtraendo (número a subtrair)
     * @return Resultado da subtração a - b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
}
