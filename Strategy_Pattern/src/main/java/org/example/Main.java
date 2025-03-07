package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");

        System.out.print("Opção: ");
        String opcao = scanner.nextLine();

        System.out.print("Digite o valor da transação: ");
        String inputValor = scanner.nextLine();
        double valor;
        try {
            valor = Double.parseDouble(inputValor);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido!");
            scanner.close();
            return;
        }
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            scanner.close();
            return;
        }

        PaymentProcessor processor;
        switch (opcao) {
            case "1":
                processor = new PaymentProcessor(new PixPayment());
                break;
            case "2":
                processor = new PaymentProcessor(new CreditCardPayment());
                break;
            case "3":
                processor = new PaymentProcessor(new BoletoPayment());
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        processor.process(valor);

        scanner.close();
    }
}