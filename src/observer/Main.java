package observer;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        new CustomerObserver(server);
        new AdminObserver(server);

        System.out.println("Send the message!!!");
        server.setMessage("Ticket Updated");
    }
}
