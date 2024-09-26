package q1;

public class Cantina_rt extends Cantina {
    @Override
    public Sanduiche criar_sanduiche() {
        return new Sanduiche(new Paobola(), new Queijocheddar(), new Presuntoperu(), new Semverdura());
    }
}
