import java.awt.*;
import java.util.Date;

public class Main {

    public static void main (String [] args) {
//
//        int age = 30, temperature = 20; // always init variable with data type
//        age = 35; // change the variable value
//
//        int myAge = 30;
//        int herAge = myAge;



        byte age = 30;
//        int viewsCount = 123_456_789;
//        long viewsCount = 3_123_456_789L;
//        double price = 10.99;
//        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        String myString = "Hello, World!";
        System.out.println(myString);



        /* Primitive type
        * Data types | Bytes | Range
        * byte | 1 | [-128, 127]
        * short | 2 | [-32K, 32K]
        * int | 4 | [-2B, 2B]
        * long | 8 |
        * float | 4 |
        * double | |
        * char | 2 | A, B, C, ...
        * boolean | 1 | true/false
        * */

        /* Reference type -> it requires to allocate memeory
        Date now = new Date();
        * */
        Date now = new Date();
        System.out.println(now.getTime());
        System.out.println(now);


        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);


        Point point1 = new Point(1, 2);
        Point point2 = point1; // copy the address

        point1.x = 2;
        System.out.println(point2);
    }
}
