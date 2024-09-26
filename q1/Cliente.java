package q1;

public class Cliente {
    public static void main(String[] args) {
        Cantina Cantina_cg = new Cantina_cg();
        Cantina Cantina_jp = new Cantina_jp();
        Cantina Cantina_rt = new Cantina_rt();

        System.out.println(Cantina_cg.exibir_sanduiche());
        System.out.println(Cantina_jp.exibir_sanduiche());
        System.out.println(Cantina_rt.exibir_sanduiche());
    }
}
