package org.example;

public class Main {
    public static void main(String[] args) {

        Corrente cc = new Corrente(1, "Rafael", 500.00, 1000.00);
        cc.exibirinformacoes();
        System.out.println("saldo: " + cc.getSaldo());
        cc.depositar(200.00);
        cc.sacar(1500.00);
        System.out.println("saldo final: " + cc.getSaldo());

        System.out.println();

        Poupanca cp = new Poupanca(2, "Karen", 1000.00);
        cp.exibirinformacoes();
        System.out.println("saldo: " + cp.getSaldo());
        cp.sacar(1200.00);
        cp.sacar(800.00);
        System.out.println("saldo final: " + cp.getSaldo());

        System.out.println();

        Investimento ci = new Investimento(3, "Gabi", 2000.00);
        ci.exibirinformacoes();
        System.out.println("saldo: " + ci.getSaldo());
        ci.sacar(1000.00);
        System.out.println("saldo final: " + ci.getSaldo());

        System.out.println();

        Salario cs = new Salario(4, "Leonardo", 1000.00, 500.00);
        cs.exibirinformacoes();
        System.out.println("saldo: " + cs.getSaldo());
        cs.sacar(300.00);
        cs.sacar(400.00);
        System.out.println("saldo final: " + cs.getSaldo());

        System.out.println();

        AltoRisco ciar = new AltoRisco(5, "lucas", 15000.00);
        ciar.exibirinformacoes();
        System.out.println("saldo: " + ciar.getSaldo());
        ciar.sacar(2000.00);
        System.out.println("saldo final: " + ciar.getSaldo());
    }
}