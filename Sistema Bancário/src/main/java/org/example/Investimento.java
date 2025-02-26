package org.example;

public class Investimento extends ContaBancaria {
    private double taxa;

    public Investimento(int numeroconta, String titular, double saldoinicial) {
        super(numeroconta, titular, saldoinicial);
        this.taxa = 0.02;
    }

    @Override
    public void sacar(double valor) {
        double valorcomtaxa = valor + (valor * taxa);
        if (valor > 0 && getSaldo() >= valorcomtaxa) {
            setSaldo(getSaldo() - valorcomtaxa);
            System.out.println("saque feito: " + valor + " (taxa 2%: " + (valor * taxa) + ")");
        } else {
            System.out.println("saldo insuficiente :(");
        }
    }

    @Override
    public void exibirinformacoes() {
        System.out.println("---Conta investimento---");
        super.exibirinformacoes();
    }
}