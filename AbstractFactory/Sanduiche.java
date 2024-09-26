package AbstractFactory;

public class Sanduiche {
    private Pao_IF pao;
    private Queijo_IF queijo;
    private Presunto_IF presunto;
    private Salada_IF tem_salada;

    public Sanduiche(Sanduiches_ingredient_factory factory) {
        this.pao = factory.criar_pao();
        this.queijo = factory.criar_queijo();
        this.presunto = factory.criar_presunto();
        this.tem_salada = factory.criar_salada();
    }

    public void exibir_ingredientes() {
        System.out.println("Componentes do sanduíche: ");
        System.out.println("Pão:        " + pao.obter_tipo());
        System.out.println("Queijo:     " + queijo.obter_tipo());
        System.out.println("Presunto:   " + presunto.obter_tipo());
        System.out.println("Salada:     " + tem_salada.obter_tipo());
    }

}
