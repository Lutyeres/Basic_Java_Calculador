package com.luysoft.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewCalculadora extends JFrame {
    private JPanel Janela;
    private JPanel jVisor;
    private JTextField tVisor;
    private JButton bSete;
    private JPanel jBotoes;
    private JButton bOito;
    private JButton bNove;
    private JButton bQuatro;
    private JButton bUm;
    private JButton bCinco;
    private JButton bDois;
    private JButton bSeis;
    private JButton bTres;
    private JButton bMenos;
    private JButton bMultiplicar;
    private JButton bDividir;
    private JButton bZero;
    private JButton bMais;

    public ViewCalculadora() {
        // Configurações da janela
        setTitle("Calculadora");
        setContentPane(Janela); // Define o painel principal criado no formulário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); // Tamanho da janela
        setLocationRelativeTo(null); // Centraliza na tela
        setVisible(true);

    }



    public static void main(String[] args) {
        new ViewCalculadora();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
