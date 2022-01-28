package decorator;

public class Electrical extends Decorator {

    public Electrical(Person person) {
        super(person);
    }

    public String getDepartment() {
        return super.getDepartment();
    }

    public String getDesignation() {
        return "Electrical " + super.getDesignation();
    }
}
