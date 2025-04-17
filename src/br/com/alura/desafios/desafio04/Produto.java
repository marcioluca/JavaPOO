package br.com.alura.desafios.desafio04;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 2500);
        Produto produto2 = new Produto("Geladeira", 3000);
        Produto produto3 = new Produto("Sofa", 1400);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        double somaPreco = 0;
        int qtdeProdutos = produtos.size();
        for (Produto produto: produtos){
            somaPreco += produto.getPreco();
            System.out.println("Produto: " + produto.getNome() + " | Preço: " + produto.getPreco());
        }
        double mediaPreco = somaPreco / qtdeProdutos;
        System.out.println("Média de preços: " +mediaPreco);
    }
}
