package q1;

public class Sanduiche {
    private Ingrediente pao;
    private Ingrediente queijo;
    private Ingrediente presunto;
    private Ingrediente tem_salada;

    public Sanduiche(Ingrediente pao, Ingrediente queijo, Ingrediente presunto, Ingrediente tem_salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.tem_salada = tem_salada;
    }

    public String obter_ingredientes() {
        return String.format("%s, %s, %s, %s",pao.obter_tipo(), queijo.obter_tipo(), presunto.obter_tipo(), tem_salada.obter_tipo());
    }

}
