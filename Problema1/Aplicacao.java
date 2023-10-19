/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

public class Aplicacao {
    public static void main(String[] args) {
        Imovel im1 = new Imovel("Pedro", 2003.76, 5, "95vv");
        Imovel im2 = new Imovel("Joao", 4234.81, 10, "96vv");
        
        Municipio m1 = new Municipio("Vila Velha");
        
        m1.incluirImovel(im1);
        im1.calcularImposto();
        m1.incluirImovel(im2);
        im2.calcularImposto();
        m1.incluirImovel(im1);
    }
}
