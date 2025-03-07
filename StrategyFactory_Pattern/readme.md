# Exercício 06 - Strategy e Factory Method em Java

## Objetivo

Implementar um sistema de pagamentos em Java, utilizando a combinação dos padrões **Strategy** e **Factory Method** para criar e processar diferentes métodos de pagamento dinamicamente.

## Descrição

Utilize como base o Exercício 04, feito em Java, que permitia ao usuário selecionar um método de pagamento e realizar uma transação fictícia. O programa deve continuar seguindo os princípios do **Strategy Pattern** para definir diferentes estratégias de pagamento, mas também deve implementar o **Factory Method Pattern** para criar instâncias de pagamento de forma dinâmica.

## Exemplo de Fluxo Esperado

1. O sistema exibe as opções de pagamento:
   - Pix
   - Cartão de Crédito
   - Boleto
2. O usuário escolhe uma opção digitando o número correspondente.
3. O sistema solicita o valor da transação.
4. O sistema utiliza a `PaymentFactory` para criar a estratégia correspondente.
5. O sistema processa o pagamento utilizando o `PaymentProcessor`.
6. O sistema exibe a confirmação do pagamento.

## Critérios de Avaliação

- [ ] Uso correto dos padrões **Strategy** e **Factory Method**.
- [ ] Código modular e reutilizável.
- [ ] Interação funcional via terminal.
- [ ] Facilidade para adicionar novos métodos de pagamento sem modificar código existente.
