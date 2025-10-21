package com.lutysoft.controller;

import com.lutysoft.view.ViewCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlerCalculadora implements ActionListener {

    private final ViewCalculadora viewCalculadora;

    public ControlerCalculadora(ViewCalculadora viewCalculadora){
        this.viewCalculadora = viewCalculadora;

    }


    public int somar(int a , int b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir( int a, int b){
        return  a / b;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
