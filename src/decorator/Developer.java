package decorator;

public class Developer extends Decorator {
    public Developer(Person person) {
        super(person);
    }

    public String getDepartment() {
        return super.getDepartment();
    }

    public String getDesignation() {
        return "Software " + super.getDesignation();
    }
}
