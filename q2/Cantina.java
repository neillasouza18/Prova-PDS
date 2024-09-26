package q2;

public class Cantina {
    private Sanduiches_ingredient_factory factory;

    public Cantina(Sanduiches_ingredient_factory factory) {
        this.factory = factory;
    }

    public Sanduiche criar_sanduiche() {
        return new Sanduiche(factory);
    }
}
