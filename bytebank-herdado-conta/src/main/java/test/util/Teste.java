package test.util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(222, 111);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(222, 111);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref);

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());
    }

}
