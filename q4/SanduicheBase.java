package q4;

abstract class SanduicheBase implements Sanduiche {
  protected String tipo;

  public SanduicheBase(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String ingredientes() {
    return tipo;
  }
}
