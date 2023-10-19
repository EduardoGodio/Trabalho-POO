/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

import Tools.InOut;
import java.util.HashMap;
import java.util.Map;

public class Municipio {

    String endereco;
    Map<String,Imovel> lista_imoveis = new HashMap<>();
    InOut io = new InOut();
    
    
    public Municipio(String endereco){
        this.endereco = endereco;
    }
    
    void incluirImovel(Imovel m){
        if(!lista_imoveis.containsKey(m.matricula)){
            lista_imoveis.put(m.matricula, m);
            io.MsgDeInformacao("Janela de Info","Cadastro realizado com sucesso.");
        }else{
            io.MsgDeInformacao("Janela de Info","Esse imovel ja foi cadastrado.");
        }
        
    }
    
}
