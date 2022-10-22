package test.util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // Usando generics
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(222, 111);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(222, 111);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref);

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        System.out.println("------------");
        Conta cc3 = new ContaCorrente(222, 333);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(222, 444);
        lista.add(cc4);

        for (Conta oRef : lista) {
            System.out.println(oRef);
        }
    }

}
