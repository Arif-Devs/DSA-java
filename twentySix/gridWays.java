package twentySix;

public class gridWays {
    public static int grWay(int i, int j, int n, int m) {
        //Base case
        if (i == n - 1 || j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int way1 =grWay(i + 1, j, n, m);
        int way2 =grWay(i, j + 1, n, m);
        return way1+way2;
        
    }
    
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(grWay(0, 0, n, m));
    }
}
