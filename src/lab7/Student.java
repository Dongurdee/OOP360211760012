package lab7;
//1. name
//2. age
//3. gender
//4. height

public class Student {
    private  String name;
    private int age;
    private String grnder;
    private double height;

    public Student(){}
    //design constructor

    public Student(String name, int age, String grnder, double height) {
        this.name = name;
        this.age = age;
        this.grnder = grnder;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grnder='" + grnder + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrnder() {
        return grnder;
    }

    public void setGrnder(String grnder) {
        this.grnder = grnder;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}//class
