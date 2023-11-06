package rendom;
import java.util.Scanner;

//Question 1

public class day3 {
    // public static void main(String args[]) {
    //     Scanner num = new Scanner(System.in);
    //     int number = num.nextInt();

    //     if (number % 2 == 0) {
    //         System.out.println("Number is positive");
    //     } else {
    //         System.out.println("number is negative");
    //     }
    // }

    //Question 2

    // public static void main(String args[]) {
    //     Scanner temp = new Scanner(System.in);
    //     float fever = temp.nextFloat();

    //     if (fever > 100) {
    //         System.out.println("You have fever");
    //     } else {
    //         System.out.println("You don't have any fever");
    //     }
    //     }

    //Question 3

        // public static void main(String args[]) {
        //     Scanner num = new Scanner(System.in);
        //     int day = num.nextInt();
            
        //     switch (day) {
        //         case 1:
        //             System.out.println("Saturday");
        //             break;
        //         case 2:
        //             System.out.println("Sunday");
        //             break;
        //         case 3:
        //             System.out.println("Monday");
        //             break;
        //         case 4:
        //             System.out.println("Tuesday");
        //             break;
        //         case 5:
        //             System.out.println("Wednesday");
        //             break;
        //         case 6:
        //             System.out.println("Thursday");
        //             break;
        //         case 7:
        //             System.out.println("Friday");
        //             break;
        //             default:System.out.println("Wrong Input");
        //     }


        // }

        //Question 5
            
        public static void main(String args[]) {
            System.out.println("Input the year");
            Scanner input = new Scanner(System.in);
            int year = input.nextInt();

            if (year % 4 == 0 || year % 400 == 0) {
                System.out.println("Leap year");
            } else if (year%100 != 0){
                System.out.println("Not leap year");
            }
        }


}





