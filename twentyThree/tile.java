package twentyThree;

public class tile {
    public static int tilePlace(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = tilePlace(n - 1);
        int horizontal = tilePlace(n - 2);

        int totalStyle = vertical + horizontal;
        return totalStyle;
    }
    public static void main(String args[]){
        System.out.println(tilePlace(8));
        
    }
}