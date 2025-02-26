package org.example;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int cap;
    private String comb;

    public Veiculo(String marca, String modelo, int ano, int cap, String comb) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cap = cap;
        this.comb = comb;
    }

    public abstract double calcAutonomia();

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Passageiros: " + cap + ", Combustível: " + comb);
    }
}
