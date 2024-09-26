package AbstractFactory;

public class Sanduiches_ingredient_factory_cg implements Sanduiches_ingredient_factory {
  @Override
  public Pao_IF criar_pao() {
    return new Paointegral();
  }

  @Override
  public Queijo_IF criar_queijo() {
    return new Queijoprato();
  }

  @Override
  public Presunto_IF criar_presunto() {
    return new Presuntofrango();
  }

  @Override
  public Salada_IF criar_salada() {
    return new Semverdura();
  }
}
