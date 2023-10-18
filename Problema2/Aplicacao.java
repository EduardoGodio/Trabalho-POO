package Problema2;

import Tools.InOut;

public class Aplicacao {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Eduardo");
        Oraculo o1 = new Oraculo("Arauto", g1);

        g1.qtdVidas = g1.setVidas();

        o1.prologoIntroducao();
        o1.loadLevel1();
        o1.prologoVencedor();
        o1.prologoPerdedor();

    }
}
