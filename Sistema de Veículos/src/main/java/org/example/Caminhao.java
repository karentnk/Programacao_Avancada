package org.example;

public class Caminhao extends Veiculo {
    private double carga;
    private double tanque;
    private  double consumo;

    public Caminhao(String marca, String modelo, int ano, int cap, double carga) {
        super(marca, modelo, ano, cap, "Diesel");
        this.carga = carga;
        this.consumo = 6;
        this.tanque = 300;
    }

    @Override
    public double calcAutonomia() {
        double reducao = Math.min(carga * 0.01, 0.25);
        double consumoAjustado = consumo * (1 - reducao);
        return tanque * consumoAjustado;
    }
}
