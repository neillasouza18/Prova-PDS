package q1;

public class Cantina_cg extends Cantina {
    @Override
    public Sanduiche criar_sanduiche() {
        return new Sanduiche(new Paointegral(), new Queijoprato(), new Presuntofrango(), new Semverdura());
    }
}
