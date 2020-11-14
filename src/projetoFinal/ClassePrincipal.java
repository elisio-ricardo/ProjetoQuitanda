package projetoFinal;

import java.io.IOException;
import javax.swing.*;
import java.io.*;

public class ClassePrincipal {
    
    //TO DO
    public static void main (String args[])
    {
        
        int opc = 0;
        while(opc!=9)
        {
            opc = Integer.parseInt("Bem vindo ao sistema da quitanda \n Selecione uma das seguintes opções: \n 1 - Para cadastrar cliente; 2 - Para realizar venda \n 9 - Finalizar aplicação");
            
            switch(opc)
            {
                case 1: CadastrarCliente(); 
                break;
                case 2: RealizarVenda();
                break;
                case 9: JOptionPane.showMessageDialog(null ,"Obrigado por utilizar a aplicação");
                break;
                
                default: JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }     
    }
    
    static void CadastrarCliente()
    {
        //To Do
    }
    
    static void RealizarVenda()
    {
        int opc = 0;
        while(opc!=9)
        {
            opc = Integer.parseInt(" 1 - Utilizar produtos pré cadastrados; \n 2 - Consultar produtos do catálogo \n 3 - Cadastrar produto no catálogo.");
            
            switch(opc)
            {
                case 1: PreDefinidas();
                break;
                case 2: ConsultaCat();
                break;
                case 3: DefinirCatalogo();
                break;
                
                case 9: JOptionPane.showMessageDialog(null, "Obrigado por utilizar");
                break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
  
    static void PreDefinidas()
    {
        Frutas [] catalogoFrutas = new Frutas [10];
        LeguVer [] catalogoLeguVer = new LeguVer[10];
        
        for(int i = 0; i<10; i++)
        {
            catalogoFrutas[i] = new Frutas();
            catalogoLeguVer[i] = new LeguVer();            
        }
        catalogoFrutas = cadastroFrutasPronto(catalogoFrutas);
        catalogoLeguVer = cadastroLeguVerPronto(catalogoLeguVer);
        
        //continuar chamando outro switch case com as opções frutas e verduras depois mostrar todas opções e ir chamando as funções para calculo.
        
    }
        
    static Frutas [] cadastroFrutasPronto(Frutas[] catalogoFrutas)
    {
        catalogoFrutas[0].nome = "Banana";
        catalogoFrutas[0].preco = 3.99; //por kg
        catalogoFrutas[1].nome = "Maçã";
        catalogoFrutas[1].preco = 0.50; //por unidade
        catalogoFrutas[2].nome = "Laranja";
        catalogoFrutas[2].preco = 0.50;
        catalogoFrutas[3].nome = "Abacaxi";
        catalogoFrutas[3].preco = 5;
        catalogoFrutas[4].nome = "Mamão";
        catalogoFrutas[4].preco = 4;
        catalogoFrutas[5].nome = "Morango";
        catalogoFrutas[5].preco = 5;
        catalogoFrutas[6].nome = "Melão";
        catalogoFrutas[6].preco = 6;
        catalogoFrutas[7].nome = "Melância";
        catalogoFrutas[7].preco = 9.99;
        catalogoFrutas[8].nome = "Manga";
        catalogoFrutas[8].preco = 2;
        catalogoFrutas[9].nome = "Limão";
        catalogoFrutas[9].preco = 0.39;

        return catalogoFrutas;
        
    }
    
    static LeguVer[] cadastroLeguVerPronto(LeguVer[] catalogoLeguVer)
    {
        catalogoLeguVer[0].nome = "Alface Crespa";
        catalogoLeguVer[0].preco = 4.99;
        catalogoLeguVer[1].nome = "Alface Americana";
        catalogoLeguVer[1].preco = 5.99;
        catalogoLeguVer[2].nome = "Brócolis";
        catalogoLeguVer[2].preco = 6;
        catalogoLeguVer[3].nome = "Beterraba"; //em rama
        catalogoLeguVer[3].preco = 6;
        catalogoLeguVer[4].nome = "Batata Doce"; //200g
        catalogoLeguVer[4].preco = 2;
        catalogoLeguVer[5].nome = "Cebola"; //500g
        catalogoLeguVer[5].preco = 5;
        catalogoLeguVer[6].nome = "Cenoura"; //500g
        catalogoLeguVer[6].preco = 5;
        catalogoLeguVer[7].nome = "Couve";
        catalogoLeguVer[7].preco = 5.50;
        catalogoLeguVer[8].nome = "Mandioquinha";
        catalogoLeguVer[8].preco = 6; //500g;
        catalogoLeguVer[9].nome = "Repolho";
        catalogoLeguVer[9].preco = 4.50;
       
        return catalogoLeguVer;
    }
    
    static void ConsultaCat()
    {
        //To do
    }
    static void DefinirCatalogo()
    {
        //To do
    }
}

