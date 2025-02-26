package org.example;

class Eletrico extends Carro {
    private double bateria;
    private  double consumo;

    public Eletrico(String marca, String modelo, int ano, int cap, String tipo, double bateria) {
        super(marca, modelo, ano, cap, tipo);
        this.bateria = bateria;
        this.consumo = 5;
    }

    @Override
    public double calcAutonomia() {
        return bateria * consumo;
    }
}
