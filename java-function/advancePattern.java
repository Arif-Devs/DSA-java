public class advancePattern {
    public static void hollo_rect(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //Rotated half pyramid
    public static void Inverted_Rotated_HalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Inverted Half pyramid
    public static void inverted_half_pyramid_number(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
    
    //Floyd's Triangle pattern
    public static void floyd_triangle_pattern(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //0-1 triangle pattern

    public static void triangle_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
    //Butterfly
    public static void butterfly(int n) {
        //1st Half
        //star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n; i>=1; i--){
                for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
    }

    public static void main(String args[]) {
        //triangle_pattern(5);
        butterfly(4);
    }
}
