package projetoFinal;

public class ClassePrincipal {
    
    //TO DO
    public static void main (String args[])
    {
        
        int opc = 0;
        while(opc!=9)
        {
            opc = Integer.parseInt("Bem vindo ao sistema da quitanda \n Selecione uma das seguintes opções: \n 1 - Utilizar produtos pré cadastrados; \n 2 - Cadastrar produtos no catálogo. \n 9 - Finalizar aplicação");
            
            switch(opc)
            {
                case 1: PreDefinidas(); 
                break;
                case 2: DefinirCatalogo();

                        
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

    }
        
    static Frutas [] cadastroFrutasPronto(Frutas[] catalogoFrutas)
    {
        catalogoFrutas[0].nome = "Banana";
        catalogoFrutas[0].preco = 3.99; //por kg
        catalogoFrutas[1].nome = "Maçã";
        catalogoFrutas[1].preco = 0.50; //por unidade
        catalogoFrutas[2].nome = "Laranja";
        catalogoFrutas[2].preco = 0.50;

        return catalogoFrutas;
        
    }
    
    static LeguVer[] cadastroLeguVerPronto(LeguVer[] catalogoLeguVer)
    {
        catalogoLeguVer[0].nome = "Alface";
        
        return catalogoLeguVer;
    }
}

