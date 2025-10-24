package com.lutysoft.controller;

import com.lutysoft.model.ModelCalculadora;
import com.lutysoft.view.ViewCalculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class ControlerCalculadora implements ActionListener {
    private Set<String> operadores;
    private Set<String> apagar;
    private final ViewCalculadora viewCalculadora;
    private ModelCalculadora calcModelTemp;

    public ControlerCalculadora(ViewCalculadora viewCalculadora) {
        this.viewCalculadora = viewCalculadora;

    }

   public void adicionar(String num){
        if(viewCalculadora.getlOperador().getText().equals("")){
            viewCalculadora.gettValor01().setText(viewCalculadora.gettValor01().getText() + num);
        }else{
            viewCalculadora.gettValor02().setText(viewCalculadora.gettValor02().getText() + num);
        }
   }

   public void resultado(int num){
        String result = Integer.toString(num);
        viewCalculadora.gettResultado().setText(result);
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
        String bAcaoComando = e.getActionCommand().toLowerCase();
        Set<String> operadores = Set.of("+", "-", "*", "/");
        Set<String> apagar = Set.of("<", "CE");

        if(apagar.contains(bAcaoComando)){
            if(bAcaoComando.equals("<")){
                
            }
        }

        if (operadores.contains(bAcaoComando)) {
            viewCalculadora.getlOperador().setText(bAcaoComando);

        } else if (bAcaoComando.equals("=")) {
            try {
                int v1 = Integer.parseInt(viewCalculadora.gettValor01().getText());
                int v2 = Integer.parseInt(viewCalculadora.gettValor02().getText());
                calcModelTemp = new ModelCalculadora(v1, v2);

                String operador = viewCalculadora.getlOperador().getText();
                if (operador.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione um operador antes de '='!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                switch (operador) {
                    case "+": resultado(somar(calcModelTemp.getValor01(), calcModelTemp.getValor02()));
                    break;
                    case "-": resultado(subtrair(calcModelTemp.getValor01(), calcModelTemp.getValor02()));
                    break;
                    case "*": resultado(multiplicar(calcModelTemp.getValor01(), calcModelTemp.getValor02()));
                    break;
                    case "/": resultado(dividir(calcModelTemp.getValor01(), calcModelTemp.getValor02()));
                    break;
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite números válidos nos campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            }


        } else {
            // caso seja número, adicionar ao JTextField focado
            adicionar(bAcaoComando);
        }
    }
}



