package q9;

public class RelatorioFinanceiro extends Relatorio {
  @Override
  protected void coletarDados() {
    System.out.println("Coletando dados financeiros...");
  }

  @Override
  protected void processarDados() {
    System.out.println("Processando cálculos financeiros...");
  }

  @Override
  protected void formatarDados() {
    System.out.println("Formatando relatório financeiro...");
  }
}
