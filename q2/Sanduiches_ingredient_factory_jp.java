package q2;

public class Sanduiches_ingredient_factory_jp implements Sanduiches_ingredient_factory {
  @Override
  public Pao_IF criar_pao() {
    return new Paofrances();
  }

  @Override
  public Queijo_IF criar_queijo() {
    return new Queijomussarela();
  }

  @Override
  public Presunto_IF criar_presunto() {
    return new Presuntofrango();
  }

  @Override
  public Salada_IF criar_salada() {
    return new Comverdura();
  }
}
