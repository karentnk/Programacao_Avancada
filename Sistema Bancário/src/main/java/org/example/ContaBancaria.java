package org.example;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroconta;

    public ContaBancaria(int numeroconta, String titular, double saldoinicial) {
        this.numeroconta = numeroconta;
        this.titular = titular;
        this.saldo = saldoinicial;
    }

    public int getnumeroconta() {
        return numeroconta;
    }

    public String gettitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("depositado: " + valor);
        } else {
            System.out.println("valor inválido :/");
        }
    }

    public abstract void sacar(double valor);

    public void exibirinformacoes() {
        System.out.println("Conta: " + numeroconta + " | Titular: " + titular + " | Saldo: " + saldo);
    }
}