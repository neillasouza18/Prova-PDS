package q6;

public class Cliente {
  public static void main(String[] args) {
    Subject subject = new Subject();
    ConcreteObserver observer1 = new ConcreteObserver();
    ConcreteObserver observer2 = new ConcreteObserver();

    subject.addObserver(observer1);
    subject.addObserver(observer2);

    // Alterações assistidas por dois 'Observers'
    subject.someStateChange("A");
    subject.someStateChange("A");
    subject.someStateChange("B");
    subject.someStateChange("A");
    subject.someStateChange("A");
    subject.someStateChange("B");
  }
}
