package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("R$" + String.format("%.2f", amount) + " com Pix");
        System.out.println("Código Pix: " + new Random().nextInt(10000));
        System.out.println("\nPagamento feito :)");
    }
}
