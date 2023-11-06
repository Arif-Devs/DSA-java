package rendom;
import java.util.Scanner;

public class day4 {
    // public static void main(String args[]) {

    //     int number = 1;

    //     while (number <= 100) {
    //         System.out.println(number);
    //         number++;

    //     }

    // }

    // public static void main(String args[]) {
    //         Scanner sc = new Scanner(System.in);
    //         int counter = 1;
    //         int n = sc.nextInt();

    //         while (counter <= n) {
    //             System.out.println("count: " + counter);
    //             counter++;
    //         }
    //     }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int sum = 0;

    //     int i = 1;
    //     while (i <= n) {
    //         sum = sum + i;
    //         i++;
    //     }
    //     System.out.println("sum is:"+ sum);
    //     }

    // public static void main(String args[]){

    //     for (int i = 1; i <= 4; i++) {
    //         System.out.println("****");
    //     }
    //     }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     int n = 654321;
    //     while (n > 0) {
    //         int lastNumber = n % 10;
    //         System.out.print(lastNumber);
    //         n = n / 10;
    //     }
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     do {
    //         System.out.print("Enter a Number: ");
    //         int n = sc.nextInt();
    //         if (n % 10 == 0) {
    //             System.out.println("break");
    //             break;
    //         }
    //         System.out.println(n);
    //     } while (true);
    //     }

    //Prime number

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     boolean isPrime = true;

    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //         }

    //     }
    //     if (isPrime == true) {
    //         System.out.println(n+" Is prime number");
    //     } else {
    //         System.out.println(n+" not prime");
    //     }
    // }

    //Task

    //Question 2

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();

    //     if (number % 2 == 0) {
    //         System.out.println(number+" is even");
    //     } else {
    //         System.out.println(number+" is odd");
    //     }

    // }

    //Question 3
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int fact = 1;
    //     int n = sc.nextInt();

    //     for (int i = 1; i <= n; i++) {
    //         fact = fact * i;
    //     }
    //     System.out.println(fact);
    //     }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter number: ");   
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
           

            System.out.println( n*i );
        }
        }




}
