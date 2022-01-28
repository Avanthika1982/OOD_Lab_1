package observer;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    
    public void notifyAllObservers() {
        for (Observer observer: this.observers) {
            observer.notifyUsers();
        }
    }
}
