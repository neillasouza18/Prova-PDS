package q4;

class SanduicheGourmet extends SanduicheDecorator {
  public SanduicheGourmet(Sanduiche sanduiche) {
    super(sanduiche);
  }

  @Override
  public String ingredientes() {
    return super.ingredientes() + " + Bacon e Cebola";
  }
}
