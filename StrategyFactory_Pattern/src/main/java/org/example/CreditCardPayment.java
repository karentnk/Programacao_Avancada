package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("R$" + String.format("%.2f", amount) + " com cartão de crédito");
        System.out.print("Digite o número do cartão: ");
        scanner.nextLine();
        System.out.println("\nPagamento feito :)");
        scanner.close();
    }
}