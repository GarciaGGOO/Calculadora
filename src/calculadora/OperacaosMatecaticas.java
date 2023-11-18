/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * A classe Calculadora fornece métodos para realizar operações básicas de cálculo.
 * Autor: Guilherme Garcia Ortega de Oliveira
 * RA: 222258
 * Data de Lançamento: 17/11/2023
 * Versão: 2.1.0
 */
public class OperacaosMatecaticas {
 /**
     * Realiza a adição de dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return A soma dos dois números.
     */
    public double somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a O número do qual será subtraído o segundo número.
     * @param b O número a ser subtraído do primeiro.
     * @return A diferença entre os dois números.
     */
    public double subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O produto dos dois números.
     */
    public double multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     *
     * @param a O numerador.
     * @param b O denominador.
     * @return O resultado da divisão.
     */
    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}