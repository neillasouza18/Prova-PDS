package FactoryMethod;

public abstract class Lanchonete {
    public abstract Sanduiche criar_sanduiche();

    public String exibir_sanduiche() {
        Sanduiche sanduiche = criar_sanduiche();
        return "Ingredientes do sanduíche: " + sanduiche.obter_ingredientes();
    }
}
