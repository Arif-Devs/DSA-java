package rendom;
public class day5 {
    // public static void main(String args[]) {
    //     for (int i = 1; i <= 4; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // practice 2
    // public static void main(String args[]) {
    //     int n = 4;

    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <=n- i+1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // Practice 3
    // public static void main(String args[]) {
    //     int n = 4;
    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    //     }
    //practice 4
    // public static void main(String args[]) {
    //     char ch = 'A';
    //     for (int i = 1; i <= 4; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(ch);
    //             ch++;
    //         }
    //         System.out.println();
    //     }
    //     }
    public static void main(String args[]) {
        char ch = 'A';
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n- i+1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        }
}