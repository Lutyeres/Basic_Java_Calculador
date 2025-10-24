package com.lutysoft.view;

import javax.swing.*;
import com.lutysoft.controller.ControlerCalculadora;

import java.awt.*;

public class ViewCalculadora extends JFrame {
    private JPanel Janela;
    private JPanel jVisor;
    private JTextField tValor01;
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
    private JButton bIgual;
    private JTextField tValoro02;
    private JTextField tResultado;
    private JLabel lIgual;
    private JLabel lOperador;
    private JButton bApagarTudo;
    private JButton bApagar;
    private ControlerCalculadora controlerCalculadora;

    public ViewCalculadora() {
        // Configurações da janela
        setTitle("Calculadora");
        setContentPane(Janela); // Define o painel principal criado no formulário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); // Tamanho da janela
        setLocationRelativeTo(null); // Centraliza na tela
        setVisible(true);

        // Configuração do JTextField Resultado
        tResultado.setBorder(null);
        this.controlerCalculadora = new ControlerCalculadora(this);
        events();

    }

    public void events(){
        bUm.addActionListener(controlerCalculadora);
        bDois.addActionListener(controlerCalculadora);
        bTres.addActionListener(controlerCalculadora);
        bQuatro.addActionListener(controlerCalculadora);
        bCinco.addActionListener(controlerCalculadora);
        bSeis.addActionListener(controlerCalculadora);
        bSete.addActionListener(controlerCalculadora);
        bOito.addActionListener(controlerCalculadora);
        bNove.addActionListener(controlerCalculadora);
        bZero.addActionListener(controlerCalculadora);
        bMais.addActionListener(controlerCalculadora);
        bMenos.addActionListener(controlerCalculadora);
        bDividir.addActionListener(controlerCalculadora);
        bMultiplicar.addActionListener(controlerCalculadora);
        bIgual.addActionListener(controlerCalculadora);
    }

    public JTextField gettValor01() {
        return tValor01;
    }

    public JTextField gettValor02(){
        return tValoro02;
    }

    public JTextField gettResultado(){
        return tResultado;
    }

    public JLabel getlOperador(){
        return lOperador;
    }

    public JTextField getCampoFocado() {
        Component c = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (c instanceof JTextField) {
            System.out.println("O foco está em: " + c);
            return (JTextField) c;
        }
        System.out.println("O foco esta em: " +  c);
        return null;
    }

    public static void main(String[] args) {
        new ViewCalculadora();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
