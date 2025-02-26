package org.example;

public class Refrigerado extends Caminhao {
    private double tempMin;

    public Refrigerado(String marca, String modelo, int ano, int cap, double carga, double tempMin) {
        super(marca, modelo, ano, cap, carga);
        this.tempMin = tempMin;
    }

    @Override
    public double calcAutonomia() {
        return super.calcAutonomia() * 0.9;
    }
}
