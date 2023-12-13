import java.util.*;
public class chocola {
    public static void main(String[] args) {
        int rows = 4, colum = 6;

        Integer verticalCost[] = { 2, 1, 3, 1, 4 };
        Integer horizontalCost[] = { 4, 1, 2 };

        Arrays.sort(verticalCost, Collections.reverseOrder());
        Arrays.sort(horizontalCost, Collections.reverseOrder());

        int h = 0, v = 0; // horizontal and vertical cut
        int hp = 1, vp = 1; //horizontal and vertical prices
        int cost = 0;

        while (h < horizontalCost.length && v < verticalCost.length) {
            if (verticalCost[v] <= horizontalCost[h]) {
                cost += (horizontalCost[h] * vp);
                hp++;
                h++;
            } else {
                cost += (verticalCost[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < horizontalCost.length) {
            cost += (horizontalCost[h] * vp);
            hp++;
            h++;

        }
        while (v < verticalCost.length) {
            cost += (verticalCost[v] * hp);
            vp++;
            v++;
        }
        
        System.out.println(cost);
    }

}
