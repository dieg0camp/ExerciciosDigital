package com.casa.exercarro;

public class ProgramaTransporte {
    public static void main(String[] args){

        Carro carro = new Carro();
        Motocicleta moto = new Motocicleta();
        Veiculo generico = new Veiculo();

        carro.setMarca ("Hiunday");
        carro.getModelo("Azzerra");
        System.out.println(" marca ");

        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto());


        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto());

        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto());


    }
}
