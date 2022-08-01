package HW1.task1;

public class District {
    private final FireDepartment fireDepartment;
    private final String name;

    public District(String name, FireDepartment fireDepartment) {
        this.fireDepartment = fireDepartment;

        this.name = name;
    }

    public void callFiremen() throws InterruptedException {
        fireDepartment.call(name);
    }
}
