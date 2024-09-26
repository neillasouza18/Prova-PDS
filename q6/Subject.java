package q6;
import java.util.ArrayList;
import java.util.List;

public class Subject {
   
  private List<Observer> observers = new ArrayList<>();
  private String state; 

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  // notificar todos
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }

  // notifica os observadores
  public void someStateChange(String newState) {
    this.state = newState;

    notifyObservers();
  }

  public String getState() {
    return this.state;
  }
}
