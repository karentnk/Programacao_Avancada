package org.example;

public class Salario extends Corrente {
    private int saquesgratuitos;

    public Salario(int numeroconta, String titular, double saldoinicial, double limitechequeespecial) {
        super(numeroconta, titular, saldoinicial, limitechequeespecial);
        this.saquesgratuitos = 1;
    }

    @Override
    public void sacar(double valor) {
        double valortotal = valor;
        if (saquesgratuitos == 0) {
            valortotal += 5.00;
        }
        if (valor > 0 && getSaldo() + getLimitechequeespecial() >= valortotal) {
            setSaldo(getSaldo() - valortotal);
            if (saquesgratuitos > 0) saquesgratuitos--;
            System.out.println("saque feito: " + valor + (saquesgratuitos == 0 ? " (taxa R$5)" : ""));
        } else {
            System.out.println("saldo insuficiente :(");
        }
    }

    @Override
    public void exibirinformacoes() {
        System.out.println("---Conta salário---");
        super.exibirinformacoes();
    }
}