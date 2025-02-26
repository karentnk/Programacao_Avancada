package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Sedan");
        carro.exibirDetalhes();
        System.out.println("O carro tem: " + carro.calcAutonomia() + " km de autonomia\n");


        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021, 2, 10);
        caminhao.exibirDetalhes();
        System.out.println("O  caminhão tem: " + caminhao.calcAutonomia() + " km de autonomia\n");


        Onibus onibus = new Onibus("Mercedes", "O500", 2023, 40, 6);
        onibus.exibirDetalhes();
        System.out.println("O ônibus tem: " + onibus.calcAutonomia() + " km de autonomia\n");


        Eletrico carroEletrico = new Eletrico("Tesla", "Model S", 2023, 5, "Sedan", 100);
        carroEletrico.exibirDetalhes();
        System.out.println("O elétrico tem: " + carroEletrico.calcAutonomia() + " km de autonomia\n");


        Refrigerado caminhaoRefrigerado = new Refrigerado("Scania", "P360", 2020, 2, 8, -10);
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("O caminhão refrigerado tem: " + String.format("%.1f", caminhaoRefrigerado.calcAutonomia()) + " km de autonomia");
    }
}
