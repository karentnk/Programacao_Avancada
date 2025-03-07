package org.example;

public class PaymentFactory {
    public static PaymentStrategy createPayment(String type) {
        switch (type) {
            case "1":
                return new PixPayment();
            case "2":
                return new CreditCardPayment();
            case "3":
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Método de pagamento inválido");
        }
    }
}