package com.casa.exercarro;

public class Veiculo {
    public double setValorVenal;
    private String marca;
    private String modelo;
    private double ValorVenal;

    public String getModelo(String azzerra){ return modelo;}
    void setModelo(String modelo){ this.modelo = modelo;}

    public String getMarca(){ return marca;}
    void setMarca(String marca){ this.marca = marca;}

    protected double getValorVenal() {
        return this.ValorVenal;
    }
    public double calculaImposto(){
        return this.ValorVenal * 0.01;}

    public void setValorVenal(double v) {
        this.setValorVenal = ValorVenal;
    }
}


