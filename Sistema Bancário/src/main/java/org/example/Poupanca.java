package org.example;

public class Poupanca extends ContaBancaria {

    public Poupanca(int numeroconta, String titular, double saldoinicial) {
        super(numeroconta, titular, saldoinicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("saque feito: " + valor);
        } else {
            System.out.println("saldo insuficiente :(");
        }
    }

    @Override
    public void exibirinformacoes() {
        System.out.println("---Conta poupança---");
        super.exibirinformacoes();
    }
}