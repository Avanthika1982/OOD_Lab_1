package decorator;

public abstract class Decorator implements Person {
    private Person newPerson;

    public Decorator(Person person) {
        this.newPerson = person;
    }

    @Override
    public String getDepartment() {
        return newPerson.getDepartment();
    }

    @Override
    public String getDesignation() {
        return newPerson.getDesignation();
    }
}
