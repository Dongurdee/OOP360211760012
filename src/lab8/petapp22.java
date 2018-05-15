package lab8;

public class petapp22 {
    public static void main(String[] args) {

        dog d1 = new dog();
        d1.setName ("Safe");
        d1.setAge(5);

        cat c1 = new cat();
        c1.setName("nana");
        c1.setAge(5);

        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());
        System.out.println(c1.toString()+" "+c1.getClass().getSimpleName());

    }//main
}//class

}
