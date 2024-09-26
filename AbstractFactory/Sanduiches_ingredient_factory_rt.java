package AbstractFactory;

public class Sanduiches_ingredient_factory_rt implements Sanduiches_ingredient_factory {
  @Override
  public Pao_IF criar_pao() {
    return new Paobola();
  }

  @Override
  public Queijo_IF criar_queijo() {
    return new Queijocheddar();
  }

  @Override
  public Presunto_IF criar_presunto() {
    return new Presuntoperu();
  }

  @Override
  public Salada_IF criar_salada() {
    return new Semverdura();
  }
}
