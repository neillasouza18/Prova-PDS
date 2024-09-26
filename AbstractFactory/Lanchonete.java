package AbstractFactory;

public class Lanchonete {
    private Sanduiches_ingredient_factory factory;

    public Lanchonete(Sanduiches_ingredient_factory factory) {
        this.factory = factory;
    }

    public Sanduiche criar_sanduiche() {
        return new Sanduiche(factory);
    }
}
