package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("R$" + String.format("%.2f", amount) + " com boleto");
        System.out.println("Código do Boleto: " + new Random().nextInt(10000));
        System.out.println("\nPagamento feito :)");
    }
}