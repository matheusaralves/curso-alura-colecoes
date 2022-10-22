package test;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 222);

        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 111);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

//        referenciaGenerica = referencias[1];

        //System.out.println(cc2.getNumero());
        //System.out.println(referencias[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(ref);

    }
}
