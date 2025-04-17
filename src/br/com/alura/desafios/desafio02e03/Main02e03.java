// Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
//Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
package br.com.alura.desafios.desafio02e03;

public class Main02e03 {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();

        if(cachorro instanceof Animal){
           Animal bob = (Animal) cachorro;
           bob.fazerSom();
    }
    }
}
