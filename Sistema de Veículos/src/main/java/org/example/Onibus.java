package org.example;

class Onibus extends Veiculo {
    private int eixos;
    private  double tanque;
    private  double consumo;

    public Onibus(String marca, String modelo, int ano, int cap, int eixos) {
        super(marca, modelo, ano, cap, "Diesel");
        if (eixos < 6 || eixos > 8) {
            throw new IllegalArgumentException(" deve ter entre 6 e 8 eixos.");
        }
        this.eixos = eixos;
        this.consumo = 5;
        this.tanque = 200;
    }

    @Override
    public double calcAutonomia() {
        return tanque * consumo;
    }
}
