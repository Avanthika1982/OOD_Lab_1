package decorator;

public class Main {

    public static void main(String[] args) {
	    Person engineer = new Engineer();
        Person electrical = new Electrical(new Engineer());
        Person developer = new Developer(new Engineer());

        System.out.println("-------- Engineer Details --------");
        System.out.println("Department: " + engineer.getDepartment());
        System.out.println("Designation: "  + engineer.getDesignation());

        System.out.println("\n-------- Electrical Details --------");
        System.out.println("Department: " + electrical.getDepartment());
        System.out.println("Designation: "  + electrical.getDesignation());

        System.out.println("\n-------- Developer Details --------");
        System.out.println("Department: " + developer.getDepartment());
        System.out.println("Designation: "  + developer.getDesignation());
    }
}
