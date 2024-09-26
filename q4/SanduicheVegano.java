package q4;

class SanduicheVegano extends SanduicheDecorator {
  public SanduicheVegano(Sanduiche sanduiche) {
    super(sanduiche);
  }

  @Override
  public String ingredientes() {
    String ingredientesOriginais = super.ingredientes();
    // Substitui o que tiver Queijo pra frente (inclui Presunto sempre) por alternativas veganas
    return ingredientesOriginais.replaceAll("Queijo.*", "Tofu, Alface, Tomate");
  }
}
