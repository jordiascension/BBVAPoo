package es.bbva.model;

//Existen dos tipos de polimorfismo:Sobrecarga y Sobreescritura
//Concepto de Sobrecarga
//Cuando dos métodos de la misma clase se llaman igual y tienen el mismo número de parámetros
//Perso los tipos son distintos
public class Calculator {

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public float sum(float num1, float num2){
        return num1 + num2;
    }
}
