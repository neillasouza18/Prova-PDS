package q9;

class RelatorioVendas extends Relatorio {
  @Override
  protected void coletarDados() {
      System.out.println("Coletando dados de vendas...");
  }

  @Override
  protected void processarDados() {
      System.out.println("Processando estatísticas de vendas...");
  }

  @Override
  protected void formatarDados() {
      System.out.println("Formatando relatório de vendas...");
  }
}
