package Problema2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Guerreiro {
    String nome;
    int qtdVidas;

    public Guerreiro(String nome){
        this.nome = nome;
    }

    int setVidas(){
        Random random = new Random();

        return random.nextInt(4) + 9;
    }
}
