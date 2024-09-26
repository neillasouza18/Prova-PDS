package q2;

public class Cliente {
    public static void main(String[] args) {
        Cantina Cantina_cg = new Cantina(new Sanduiches_ingredient_factory_cg());
        Cantina Cantina_jp = new Cantina(new Sanduiches_ingredient_factory_jp());
        Cantina Cantina_rt = new Cantina(new Sanduiches_ingredient_factory_rt());

        Sanduiche sanduiche_cg = Cantina_cg.criar_sanduiche();
        Sanduiche sanduiche_jp = Cantina_jp.criar_sanduiche();
        Sanduiche sanduiche_rt = Cantina_rt.criar_sanduiche();

        System.out.println("Sanduíche CG:");
        sanduiche_cg.exibir_ingredientes();
        System.out.println("\nSanduíche JP:");
        sanduiche_jp.exibir_ingredientes();
        System.out.println("\nSanduíche RT:");
        sanduiche_rt.exibir_ingredientes();
    }
}
