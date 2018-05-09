package lab5;

import java.util.Scanner;

//1. method for input data  (10)
//2. method for show data in array
//3. method to find average value in array
//4. method to find maximum value in array
//5. method to find minimum value in array
public class arrayOpertor {
    public static final int MAX = 10;
    public static void main(String[] args) {
        int myArray[] = new int[MAX];
        myArray = inputData(myArray);
        showData(myArray);
        findAverage(myArray);
        findMAX(myArray);
        findMIN(myArray);
    }  //main

    private static void findMIN(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min >= myArray(i))
                min = myArray[i];
        }
        System.out.print("The minmum Value is " + min);
    }


    private static void findMAX(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i< myArray.length; i++){
            if (max <= myArray(i))
                max = myArray[i];
            }
            System.out.print("The maximum Value is " + max);
        }
    }

    private static void findAverage(int[] myArray) {
        int total = 0;
        for (int val : myArray)
            total += val;
        System.out.print("The average value is" + (total/MAX));
    }

    private static void showData(int[] myArray) {
        System.out.println("Data in array: ");
        for (int val:myArray)
            System.out.print(val+"\t");
    }

    private static int[] inputData(int[] myArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integers: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("integer "+i+": ");
            myArray[i] = sc.nextInt();
        }
        return myArray;

    }

}//class