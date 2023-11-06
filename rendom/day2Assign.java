package rendom;
import java.util.Scanner;

public class day2Assign {
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     int total = (a + b + c) / 3;
    //     System.out.println(total);
    //     ;
    // }

    // public static void main(String args[]) {
    //     Scanner area = new Scanner(System.in);
    //     int side = area.nextInt();
    //     int totalArea = side * side;
    //     System.out.println(totalArea);
    //     }

    public static void main(String args[]) {
        Scanner items = new Scanner (System.in);
        float pencil = items.nextFloat();
        float pen = items.nextFloat();
        float eraser = items.nextFloat();
        float total = (pen + pencil + eraser);
        float GST = (total * 18) / 100;
        float netCost = total + GST;
        System.out.println(netCost);
        }

}


 