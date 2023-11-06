package rendom;

import java.util.Scanner;




// public class condition {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age > 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("not adult");
//         }

//     }
// }

// public class condition{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("odd");
//         }
//     }
// }

// public class condition {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
       

//         if () {
//             System.out.println("equal");
//         } else if (a > b) {
//             System.out.println("a greater then b");

//         } else {
//             System.out.println("a is lesser");
//         }
//     }

// }

    
// public class condition {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
    
//         switch (button) {
//             case 1 : System.out.println("hello");
//             break;
//             case 2 : System.out.println("hi");
//             break;
//             case 3: System.out.println("salam");
//             break;
//             default: System.out.println("invalid");
            
//         }

//     }
// }

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
       
        switch (operator) {
            case 1:
                 System.out.println(a + b);
            break;
        case 2 : System.out.println(a-b);
            break;
        case 3:
            System.out.println(a * b);
            break;
        case 4:
            System.out.println(a / b);
            break;
        case 5:
            System.out.println(a % b);
            break;
        default: System.out.println("invalid");
    }
       

    }

}