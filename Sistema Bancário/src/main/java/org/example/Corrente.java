package org.example;

public class Corrente extends ContaBancaria {
    private double limitechequeespecial;

    public Corrente(int numeroconta, String titular, double saldoinicial, double limitechequeespecial) {
        super(numeroconta, titular, saldoinicial);
        this.limitechequeespecial = limitechequeespecial;
    }

    public double getLimitechequeespecial() {
        return limitechequeespecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() + limitechequeespecial >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("saque feito: " + valor);
        } else {
            System.out.println("saldo insuficiente :(");
        }
    }

    @Override
    public void exibirinformacoes() {
        System.out.println("---Conta corrente---");
        super.exibirinformacoes();
    }
}