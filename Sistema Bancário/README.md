# Exercício de Herança: Sistema Bancário

## 1. Criar uma classe abstrata ContaBancaria
- **Atributos:**
  - `numeroConta`
  - `titular`
  - `saldo`
- **Métodos:**
  1. Construtor que inicializa os atributos.
  2. `depositar(double valor)`: aumenta o saldo.
  3. `sacar(double valor)` *(abstrato)*: será implementado pelas subclasses.
  4. `exibirInformacoes()`: imprime os dados da conta.

---

## 2. Criar três classes que herdam de ContaBancaria
- **`ContaCorrente`**
- **`ContaPoupanca`**
- **`ContaInvestimento`**

---

## 3. Regras específicas para saque em cada classe
### a. ContaCorrente
- Possui um **limite de cheque especial**.
- Se o saldo for insuficiente, pode usar o cheque especial até um limite predefinido.

### b. ContaPoupanca
- Só permite saque se o **saldo for suficiente** (não pode ficar negativo).

### c. ContaInvestimento
- Aplica uma **taxa de retirada de 2%** sobre o valor sacado.

---

## 4. Criar duas subclasses adicionais para especializar as contas
### a. ContaSalario (herda de ContaCorrente)
- Regras:
  - Apenas **um saque gratuito por mês**.
  - Saques adicionais têm uma taxa de **R$ 5,00**.

### b. ContaInvestimentoAltoRisco (herda de ContaInvestimento)
- Regras:
  - **Taxa de retirada de 5%**.
  - **Saldo mínimo exigido para saque**: R$ 10.000,00.

---

## 5. Criar uma classe Main
- Objetivo: testar todas as regras definidas acima.
