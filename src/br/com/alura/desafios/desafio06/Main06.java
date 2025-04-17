package br.com.alura.desafios.desafio06;

import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(128, 2500);
        ContaBancaria conta2 = new ContaBancaria(122, 5000);
        ContaBancaria conta3 = new ContaBancaria(138, 1500);
        ContaBancaria conta4 = new ContaBancaria(125, 7150);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        ContaBancaria maiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas){
            if(conta.getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = conta;
        }

    }
        System.out.println("Conta com o maior saldo | Número: " + maiorSaldo.getNumeroConta() +
                ", Saldo: " + maiorSaldo.getSaldo());
    }
}
