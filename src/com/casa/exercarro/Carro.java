package com.casa.exercarro;

public class Carro extends Veiculo {
    private int quantPortas;
    public int getQuantPortas (){ return quantPortas;}
    public void setQuantPortas(){ this.quantPortas = quantPortas;}



    public double calculaImposto(){
        return this.getValorVenal() * 0.07;
    }

}
