package amirka.u5w3d3.exercise1.entities;

public class UserData {
    private String fullname;
    private int age;

    public void getData(DataSource ds) {
        this.fullname = ds.getFullName();
        this.age = ds.getAge();
    }

    @Override
    public String toString() {
        return "UserData{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
