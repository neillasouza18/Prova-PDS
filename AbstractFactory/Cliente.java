package AbstractFactory;

public class Cliente {
    public static void main(String[] args) {
        Lanchonete Lanchonete_cg = new Lanchonete(new Sanduiches_ingredient_factory_cg());
        Lanchonete Lanchonete_jp = new Lanchonete(new Sanduiches_ingredient_factory_jp());
        Lanchonete Lanchonete_rt = new Lanchonete(new Sanduiches_ingredient_factory_rt());

        Sanduiche sanduiche_cg = Lanchonete_cg.criar_sanduiche();
        Sanduiche sanduiche_jp = Lanchonete_jp.criar_sanduiche();
        Sanduiche sanduiche_rt = Lanchonete_rt.criar_sanduiche();

        System.out.println("Sanduíche CG:");
        sanduiche_cg.exibir_ingredientes();
        System.out.println("\nSanduíche JP:");
        sanduiche_jp.exibir_ingredientes();
        System.out.println("\nSanduíche RT:");
        sanduiche_rt.exibir_ingredientes();
    }
}
