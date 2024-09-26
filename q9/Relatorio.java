package q9;

abstract public class Relatorio {
  
  // Método template
  public final void gerarRelatorio() {
    coletarDados();
    processarDados();
    formatarDados();
    exibirRelatorio();
  }

  // Etapas a serem implementadas pelas subclasses
  protected abstract void coletarDados();
  protected abstract void processarDados();
  protected abstract void formatarDados();

  // Método comum a todos os relatórios
  private void exibirRelatorio() {
      System.out.println("Exibindo relatório...");
  }
}
