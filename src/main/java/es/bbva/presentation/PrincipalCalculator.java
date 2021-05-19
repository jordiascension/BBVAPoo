package es.bbva.presentation;

import es.bbva.model.Calculator;

public class PrincipalCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        float resultado = calculator.sum(4.50f, 5.67f);
        System.out.println("El resultado es " + resultado);

        int resultado1 = calculator.sum(4, 5);
        System.out.println("El resultado es " + resultado1);

        int resultado2 = calculator.sum(4, 5, 6);
        System.out.println("El resultado es " + resultado2);
    }
}
