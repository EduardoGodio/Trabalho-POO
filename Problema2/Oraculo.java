package Problema2;

import Tools.InOut;

import java.util.Random;
import java.util.Scanner;


public class Oraculo {
    String nome;
    Guerreiro warrior;
    InOut io = new InOut();
    int validade;


    public Oraculo(String nome, Guerreiro warrior){
        this.nome = nome;
        this.warrior = warrior;
    }


    void setNome(String nome){
        this.nome = nome;
    }

    void prologoIntroducao(){
        io.MsgDeInformacao("Seja Bem-Vindo","Oraculo " + this.nome + " e seu guerreiro tem " + this.warrior.qtdVidas + " vidas");
    }

    void loadLevel1(){
        Random random = new Random();

        int chute;
        int val = random.nextInt(100) + 1;
        int vidas = this.warrior.qtdVidas;
        io.MsgDeInformacao("Janela do Jogador", "Tente acertar o numero entre [0-100]");
        for(int i = 0; i < vidas; i++){
            chute = io.leInt("Coloque o seu chute: ");
            if(chute > val){
                io.MsgDeInformacao("Janela do Jogador", "O valor é MENOR\n Vidas = " + this.warrior.qtdVidas);
                this.warrior.qtdVidas--;
            }else if(chute < val){
                io.MsgDeInformacao("Janela do Jogador", "O valor é MAIOR \n Vidas = " + this.warrior.qtdVidas);
                this.warrior.qtdVidas--;
            }else{
                io.MsgDeInformacao("Janela do Jogador", "Voce ACERTOUU\nPassou de fase");
                break;
            }
            if(this.warrior.qtdVidas <= 0 && validade != 1){
                this.decidirVidaExtra();
                vidas++;
            }
            if(this.warrior.qtdVidas < 0){
                break;
            }
        }
        if(this.warrior.qtdVidas > 0){
            this.loadLevel2();
        }
    }

    void loadLevel2(){

        while(true){
            int option, flag;
            do{
                option = io.leInt("Coloque 0 para Par e 1 para Impar: ");
                if(option > 1 || option < 0){
                    io.MsgDeErro("Janela de Erro","ERRO: Insira apenas 0 ou 1!");
                }
            }while(option > 1 || option < 0);
            
            Random random = new Random();
            int valorOraculo = random.nextInt(20);
            int valorGuerreiro = random.nextInt(20);

            io.MsgDeInformacao("Janela de Info" , "Oráculo: " + valorOraculo + "\nGuerreiro: " + valorGuerreiro);
            int soma = valorOraculo + valorGuerreiro;
            io.MsgDeInformacao("Janela de Info", "Soma é: " + soma);
            boolean resultadoPar = (soma % 2 == 0);
            if(option == 0 && resultadoPar){
                io.MsgDeInformacao("Janela do Ganhador", "O ganhador foi o Guerreiro\nGANHAMOSSSS");
            }else if(option == 1 && !resultadoPar) {
                io.MsgDeInformacao("Janela do Ganhador", "O ganhador foi o Guerreiro\nGANHAMOSSSS");
            }else{
                io.MsgDeInformacao("Janela do Ganhador", "O ganhador foi o Oraculo\nPERDEMOS");
                this.warrior.qtdVidas--;
            }
            if(this.warrior.qtdVidas <= 0 && validade != 1){
                this.decidirVidaExtra();
            }
            if(this.warrior.qtdVidas <= 0){
                break;
            }
            do{
                flag = io.leInt("Jogar: 1 \t Suas vidas: "+ this.warrior.qtdVidas+"\n Sair: 0");
                if(flag < 0 || flag > 1){
                    io.MsgDeErro("Janela de Erro","ERRO: Insira apenas 0 ou 1!");
                }
            }while(flag < 0 || flag > 1);
            if(flag != 1){
                break;
            }
        }
    }

    void decidirVidaExtra(){
        String pedido;
        pedido = io.leString("Faça seu pedido por uma vida extra.");
        if(pedido.length() >= 5){
            io.MsgDeInformacao("Janela de Info","Ganhou uma vida extra");
            this.warrior.qtdVidas++;
            validade = 1;
        }else{
            io.MsgDeInformacao("Janela de Info","Não ganhou uma vida extra");
        }
    }

    void prologoVencedor(){
        if(this.warrior.qtdVidas > 0){
            io.MsgDeInformacao("Resultado do Jogo","Voce venceu todos os níveis do Oraculo " + this.nome + ", Parabéns Guerreiro");
        }
    }

    void prologoPerdedor(){
        if(this.warrior.qtdVidas <= 0){
            io.MsgDeInformacao("Resultado do Jogo","Voce perdeu todas as vidas ao tentar derrotar o Oraculo " + this.nome);
        }
    }
}
