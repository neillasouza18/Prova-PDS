package FactoryMethod;

public class Lanchonete_jp extends Lanchonete {
    @Override
    public Sanduiche criar_sanduiche() {
        return new Sanduiche(new Paofrances(), new Queijomussarela(), new Presuntofrango(), new Comverdura());
    }
}
