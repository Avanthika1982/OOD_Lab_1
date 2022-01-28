package observer;

public abstract class Observer {
    public Server server;
    public abstract void notifyUsers();
}
