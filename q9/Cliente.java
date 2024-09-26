package q9;

public class Cliente {
  public static void main(String[] args) {
    Relatorio relatorioFinanceiro = new RelatorioFinanceiro();
    relatorioFinanceiro.gerarRelatorio();
    
    System.out.println("\n");

    Relatorio relatorioVendas = new RelatorioVendas();
    relatorioVendas.gerarRelatorio();
  }
}
