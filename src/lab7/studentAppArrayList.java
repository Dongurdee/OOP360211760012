package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studentAppArrayList {
    private static void main (String[]args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many you do have : ");
        int Val = Integer.parseInt(reader.readLine());
        ArrayList<Student> myList = new ArrayList<Student>();
        myList = inputData(myList,Val);
        showdata(myList);
    }

    private static void showdata(ArrayList<Student> myList) {
        for (int i = 0; i<myList.size(); i++){
            System.out.println("Name : " + myList.get(i).getName());
            System.out.println("Age : "+ myList.get(i).getAge());
            System.out.println("Gender : "+myList.get(i).getGrnder());
            System.out.println("Heigh : " +myList.get(i).getHeight());
        }
        }
    }

    private  static  ArrayList inputData(ArrayList<Student> myList,int val)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student s = new Student();
        for (int i =1; i<=val; i++);{
        System.out.println();("Enter student info " +(i+1)" :");
        System.out.print("Name : ");
        s.setName(reader.readLine());
        System.out.print("Age : ");
        s.setAge(Integer.parseInt(reader.readLine()));
        System.out.print("Gender : ");
        s.setGrnder(reader.readLine());
        System.out.print("Height :");
        s.setHeight(Double.parseDouble(reader.readLine()));
        myList.add(s);
    }
    return myList;

}
