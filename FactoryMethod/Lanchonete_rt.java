package FactoryMethod;

public class Lanchonete_rt extends Lanchonete {
    @Override
    public Sanduiche criar_sanduiche() {
        return new Sanduiche(new Paobola(), new Queijocheddar(), new Presuntoperu(), new Semverdura());
    }
}
