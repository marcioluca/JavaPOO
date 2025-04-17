package br.com.alura.desafios.desafio05;

import java.util.ArrayList;

public class Main05 {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();


        formas.add(new Circulo(5.0)); // raio 5
        formas.add(new Quadrado(4.0)); // lado 4


        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}