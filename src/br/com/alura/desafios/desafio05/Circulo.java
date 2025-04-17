package br.com.alura.desafios.desafio05;

class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}