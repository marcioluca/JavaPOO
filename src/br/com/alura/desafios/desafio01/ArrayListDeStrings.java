// Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
package br.com.alura.desafios.desafio01;
import java.util.ArrayList;

public class ArrayListDeStrings {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("lucas");
        nomes.add("Carlos");
        nomes.add("José");
        for (String nome : nomes ){
            System.out.println("Nome: " +nome);
        }
    }
}
