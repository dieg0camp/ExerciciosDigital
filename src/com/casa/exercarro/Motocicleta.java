package com.casa.exercarro;

public class Motocicleta extends Veiculo {


    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }


    public void setCilindradas(){
            this.cilindradas = cilindradas;}

    public double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }
}
