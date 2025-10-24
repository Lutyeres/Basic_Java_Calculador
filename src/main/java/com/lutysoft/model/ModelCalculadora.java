package com.lutysoft.model;

public class ModelCalculadora {

    private int valor01;
    private int valor02;

    public ModelCalculadora(){

    }

    public ModelCalculadora(int valor01, int valor02) {
        this.valor01 = valor01;
        this.valor02 = valor02;
    }

    public int getValor01() {
        return valor01;
    }

    public void setValor01(int valor01) {
        this.valor01 = valor01;
    }

    public int getValor02() {
        return valor02;
    }

    public void setValor02(int valor02) {
        this.valor02 = valor02;
    }

}
