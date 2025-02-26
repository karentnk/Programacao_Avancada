package org.example;

public class Carro extends Veiculo {
    private String tipo;
    private  double tanque;
    private  double consumo;

    public Carro(String marca, String modelo, int ano, int cap, String tipo) {
        super(marca, modelo, ano, cap, "Gasolina");
        this.tipo = tipo;
        this.consumo = 12;
        this.tanque = 50;

    }

    @Override
    public double calcAutonomia() {
        return tanque * consumo;
    }
}
