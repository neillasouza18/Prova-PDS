package q4;

abstract class SanduicheDecorator implements Sanduiche {
  protected Sanduiche sanduiche;

  public SanduicheDecorator(Sanduiche sanduiche) {
    this.sanduiche = sanduiche;
  }

  @Override
  public String ingredientes() {
    return sanduiche.ingredientes();
  }
}
