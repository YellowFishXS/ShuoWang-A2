public class Employee extends Person {
    private String id;
    private String department;

    public Employee() {
        super(); // 调用父类默认构造器
        this.id = "000";
        this.department = "Unknown";
    }

    public Employee(String name, int age, String sex, String id, String department) {
        super(name, sex, age); // 调用父类带参数构造器
        this.id = id;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
