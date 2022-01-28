package observer;

public class CustomerObserver extends Observer {
    public CustomerObserver(Server server) {
        this.server = server;
        this.server.attach(this);
    }

    @Override
    public void notifyUsers() {
        System.out.println("New " + this.server.getMessage() + " received from admin");
    }
}
