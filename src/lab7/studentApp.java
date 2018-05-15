package lab7;

import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGrnder("Male");
        s1.setHeight(180);
        System.out.println(s1.toString());

        Student s2 = new Student("safe",90,"Female",190);
        System.out.println(s2.toString());
        //intput data from user
        Student s3 = new Student()
        s3 = inputdata(s3);
        System.out.print(s3.toString());
    }//main

    private static Student inputdata(Student s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your infromation : ");
        System.out.print("name : ");
        s.setName(nextLione());
        System.out.print("Age : ");
        s.setAge(sc.nextInt());
        System.out.print("Gender : ");
        s.setGrnder(sc.nextLine());
        System.out.print("Height : ");
        s.setHeight(sc.nextInt());
        return s;
    }
}
