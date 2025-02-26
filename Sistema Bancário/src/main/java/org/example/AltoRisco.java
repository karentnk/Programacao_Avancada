package org.example;

public class AltoRisco extends Investimento {
    private double taxaretirada;
    private double saldominimo;

    public AltoRisco(int numeroconta, String titular, double saldoinicial) {
        super(numeroconta, titular, saldoinicial);
        this.taxaretirada = 0.05;
        this.saldominimo = 10000.00;
    }

    @Override
    public void sacar(double valor) {
        double valorcomtaxa = valor + (valor * taxaretirada);
        if (valor > 0 && getSaldo() >= valorcomtaxa && (getSaldo() - valorcomtaxa) >= saldominimo) {
            setSaldo(getSaldo() - valorcomtaxa);
            System.out.println("saque feito: " + valor + " (taxa 5%: " + (valor * taxaretirada) + ")");
        } else {
            System.out.println("saldo insuficiente :(");
        }
    }

    @Override
    public void exibirinformacoes() {
        System.out.println("---Conta investimento alto risco---");
        super.exibirinformacoes();
    }
}