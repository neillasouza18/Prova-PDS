package q6;

public class ConcreteObserver implements Observer {
  @Override
  public void update(Subject s) {
    System.out.println("Estado atualizado para: " + s.getState());
  }
}
