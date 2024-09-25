public class Lanchonete_cg extends Lanchonete {
    @Override
    public Sanduiche criar_sanduiche() {
        return new Sanduiche(new Paointegral(), new Queijoprato(), new Presuntofrango(), new Semverdura());
    }
}
