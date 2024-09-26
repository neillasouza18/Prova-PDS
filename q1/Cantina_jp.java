package q1;

public class Cantina_jp extends Cantina {
    @Override
    public Sanduiche criar_sanduiche() {
        return new Sanduiche(new Paofrances(), new Queijomussarela(), new Presuntofrango(), new Comverdura());
    }
}
