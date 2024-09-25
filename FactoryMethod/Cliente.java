package FactoryMethod;

public class Cliente {
    public static void main(String[] args) {
        Lanchonete Lanchonete_cg = new Lanchonete_cg();
        Lanchonete Lanchonete_jp = new Lanchonete_jp();
        Lanchonete Lanchonete_rt = new Lanchonete_rt();

        System.out.println(Lanchonete_cg.exibir_sanduiche());
        System.out.println(Lanchonete_jp.exibir_sanduiche());
        System.out.println(Lanchonete_rt.exibir_sanduiche());
    }
}
