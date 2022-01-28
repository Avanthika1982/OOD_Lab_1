package decorator;

public class Engineer implements Person {
    @Override
    public String getDepartment() {
        return "Engineering";
    }

    @Override
    public String getDesignation() {
        return "Engineer";
    }
}
