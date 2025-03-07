package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");


        System.out.print("Opção: ");
        String opcao = scanner.nextLine();

        String tipoNotificacao;
        switch (opcao) {
            case "1":
                tipoNotificacao = "email";
                break;
            case "2":
                tipoNotificacao = "sms";
                break;
            case "3":
                tipoNotificacao = "push";
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.print("Escreva a mensagem: ");
        String mensagem = scanner.nextLine();

        try {

            Notification notification = NotificationFactory.createNotification(tipoNotificacao);
            notification.send(mensagem);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}