# Exercício: Herança em Linguagens de Programação Moderna

Você está desenvolvendo um sistema de gerenciamento de veículos para uma empresa de transportes. O sistema será inicialmente estruturado utilizando **herança**, mas, posteriormente, algumas classes serão refatoradas para utilizar **composição**. Abaixo estão os requisitos detalhados para o exercício:

---

## 1. Classe Abstrata Veiculo

Crie uma classe abstrata chamada Veiculo, que servirá como base para todos os tipos de veículos no sistema.

### Atributos
- `marca`  
- `modelo`  
- `ano`  
- `capacidadePassageiros`  
- `combustivel`

### Métodos
1. **Construtor**:  
   Inicializa os atributos. Caso alguma validação seja necessária, ela deve ser implementada no construtor da classe.  
2. **calcularAutonomia()**:  
   Método abstrato que será implementado nas subclasses.  
3. **exibirDetalhes()**:  
   Método concreto que imprime as informações do veículo.

---

## 2. Subclasses de Veiculo

Crie três classes que herdam de Veiculo:

### a. Carro  
### b. Caminhao  
### c. Onibus  

---

## 3. Detalhamento das Subclasses

Cada classe deve adicionar um **atributo próprio** e sobrescrever o método calcularAutonomia() conforme as regras abaixo:

### a. Carro
- **Atributo Adicional**: tipoCarro (sedan, hatch, SUV)  
- **Autonomia**:  
  - Tanque de **50 litros**  
  - Consumo de **12 km/L**  

### b. Caminhao
- **Atributo Adicional**: capacidadeCarga (em toneladas)  
- **Autonomia**:  
  - Tanque de **300 litros**  
  - Consumo base de **6 km/L**  
  - **Regra**:  
    - Para cada tonelada de carga, o consumo diminui **1%**, com redução máxima de **25%**.  
    - Exemplo: Um caminhão com 5 toneladas terá consumo de **5,7 km/L** (redução de 5%).  

### c. Onibus
- **Atributo Adicional**: quantidadeEixos 
- **Autonomia**:  
  - Tanque de **200 litros**  
  - Consumo de **5 km/L**  
- **Regra**:  
  - Todo ônibus deve ter entre **6 e 8 eixos** no máximo.

---

## 4. Subclasses Especializadas

Crie duas subclasses adicionais que especializam os veículos existentes:

### a. CarroEletrico (herda de Carro)
- **Atributo Adicional**: bateriaKWh  
- **Autonomia**:  
  - Redefine calcularAutonomia() para usar um consumo de **5 km por kWh**.

### b. CaminhaoRefrigerado (herda de Caminhao)
- **Atributo Adicional**: temperaturaMinima 
- **Autonomia**:  
  - Reduz a autonomia em **10%** devido ao sistema de refrigeração.

---

## 5. Classe Main

Crie uma classe Main para testar todas as implementações acima. Certifique-se de instanciar objetos de cada classe e demonstrar o funcionamento dos métodos calcularAutonomia() e exibirDetalhes().
