public abstract class Person {
    private String name;
    private String sex;
    private int age;

    public Person(){
        this.age = 0;
        this.sex= null;
        this.name= null;
    }

    public Person(String name, String sex, int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
