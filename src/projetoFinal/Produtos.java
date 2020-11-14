package projetoFinal;

class Frutas 
{
    String nome;
    double preco;
    
    Frutas()
    {
        this(" ", 0);
    }
    
    Frutas(String nomeFruta, double precoFruta)
    {
        nome = nomeFruta;
        preco = precoFruta;
    }
}

class LeguVer //Legumes e verduras
{
    String nome;
    double preco;
    
    LeguVer()
    {
        this (" ", 0);
    }
    
    LeguVer(String nomeLegume, double precoLegume)
    {
        nome = nomeLegume;
        preco = precoLegume;
    }
}

