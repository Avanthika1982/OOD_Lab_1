package observer;

public class AdminObserver extends Observer {

    public AdminObserver(Server server) {
        this.server = server;
        this.server.attach(this);
    }

    @Override
    public void notifyUsers() {
        System.out.println("New " + this.server.getMessage() + " received from customer");
    }
}
