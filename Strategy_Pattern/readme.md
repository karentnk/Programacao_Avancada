# Strategy Pattern em Java

## Objetivo

Implementar um sistema simples de pagamentos em Java, utilizando o **Strategy Pattern** para permitir a escolha dinâmica do método de pagamento via terminal.

## Descrição

Crie um programa em Java que permita ao usuário selecionar um método de pagamento e processar uma transação fictícia. O programa deve seguir os princípios do **Strategy Pattern**, garantindo que novos métodos de pagamento possam ser adicionados sem modificar o código existente.

## Requisitos

1. Criar uma interface chamada `PaymentStrategy` com um método `processPayment(double amount)`.
2. Implementar três classes que representam diferentes métodos de pagamento:
   - **PixPayment**: Exibe um código aleatório de Pix.
   - **CreditCardPayment**: Solicita um número fictício de cartão e confirma o pagamento.
   - **BoletoPayment**: Exibe um código de boleto fictício.
3. Criar uma classe `PaymentProcessor` que recebe uma estratégia de pagamento e a executa.
4. Criar uma classe `Main` que exiba um menu no terminal para o usuário escolher o método de pagamento e inserir o valor da transação.

## Exemplo de Fluxo Esperado

1. O sistema exibe as opções de pagamento:
   - 1: Pix
   - 2: Cartão de Crédito
   - 3: Boleto
2. O usuário seleciona uma opção digitando o número correspondente.
3. O sistema solicita o valor da transação.
4. O sistema processa o pagamento e exibe uma mensagem confirmando a transação.

## Critérios de Avaliação

- [ ] Uso correto do **Strategy Pattern**.
- [ ] Código modular e reutilizável.
- [ ] Interação funcional via terminal.
- [ ] Facilidade para adicionar novos métodos de pagamento sem alterar código existente.
