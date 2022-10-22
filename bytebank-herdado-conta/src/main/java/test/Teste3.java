package test;

import modelo.Conta;
import modelo.ContaCorrente;

public class Teste3 {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();
        Conta cc = new ContaCorrente(222, 111);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(222, 111);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }

}
