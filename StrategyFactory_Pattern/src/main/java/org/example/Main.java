package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha como pagar:");
        System.out.println("1. Pix");
        System.out.println("2. Cartão de crédito");
        System.out.println("3. Boleto");

        System.out.print("Opção: ");
        String escolha = scanner.nextLine();


        System.out.print("Digite o valor da transação: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor errado!");
            return;
        }

        PaymentStrategy metodo = PaymentFactory.createPayment(escolha);
        if (metodo == null) {
            System.out.println("Escolha errada!");
            return;
        }

        PaymentProcessor processador = new PaymentProcessor(metodo);
        processador.process(valor);

        scanner.close();
    }
}