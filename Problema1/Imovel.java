/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

import Tools.InOut;
/**
 *
 * @author bilog
 */
public class Imovel {
    String matricula;
    String nome;
    double imposto;
    int meses_atraso;
    InOut io = new InOut();
    
    
    public Imovel(String nome, double imposto, int meses, String matricula){
        this.nome = nome;
        this.imposto = imposto;
        this.meses_atraso = meses;
        this.matricula = matricula;
    
    }
    
    Imovel criarImovel(){
        String nome = io.leString("Qual o nome do Imovel: ");
        String matricula = io.leString("Matricula: ");
        double imposto = io.leDouble("Imposto: ");
        int meses = io.leInt("Quantos meses de atraso: ");
        Imovel imovel = new Imovel(nome, imposto, meses, matricula);
        return imovel;
    }
    
    double calcularImposto(){
        if(this.meses_atraso >= 0 && this.meses_atraso <= 5){
            io.MsgDeInformacao("Janela de Info","Multa a ser pago: " + String.format("%.2f", ((this.imposto * 1.01) - this.imposto)));
            io.MsgDeInformacao("Janela de Info","Multa com imposto: " + String.format("%.2f",this.imposto * 1.01));
            return this.imposto * 1.01;
        } else if(this.meses_atraso >= 6 && this.meses_atraso <= 8){
            io.MsgDeInformacao("Janela de Info","Multa a ser pago: " + String.format("%.2f", ((this.imposto * 1.023) - this.imposto)));
            io.MsgDeInformacao("Janela de Info","Multa com imposto: " + String.format("%.2f", this.imposto * 1.023));
            return this.imposto * 1.023;
        }else if(this.meses_atraso >= 9 && this.meses_atraso <= 10){
            io.MsgDeInformacao("Janela de Info","Multa a ser pago: " + String.format("%.2f", ((this.imposto * 1.03) - this.imposto)));
            io.MsgDeInformacao("Janela de Info","Multa com imposto: " + String.format("%.2f", this.imposto * 1.03));
            return this.imposto * 1.03;
        }else if(this.meses_atraso >= 11 && this.meses_atraso <= 12){
            io.MsgDeInformacao("Janela de Info","Multa a ser pago: " + String.format("%.2f", ((this.imposto * 1.054) - this.imposto)));
            io.MsgDeInformacao("Janela de Info","Multa com imposto: " + String.format("%.2f", this.imposto * 1.054));
            return this.imposto * 1.054;
        }else if(this.meses_atraso > 12){
            io.MsgDeInformacao("Janela de Info","Multa a ser pago: " + String.format("%.2f", ((this.imposto * 1.1) - this.imposto)));
            io.MsgDeInformacao("Janela de Info","Multa com imposto: " + String.format("%.2f", this.imposto * 1.1));
            return this.imposto * 1.1;
        }else{
            io.MsgDeInformacao("Janela de Info","Multa a ser pago: " + String.format(".2f", ((this.imposto) - this.imposto)));
            io.MsgDeInformacao("Janela de Info","Multa com imposto: " + String.format(".2f", this.imposto));
            return this.imposto;
        }
    }
    
    
}
