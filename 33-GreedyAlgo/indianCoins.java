import java.util.*;

public class indianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoin = 0;
        int totalAmount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= totalAmount) {
                while (coins[i] <= totalAmount) {
                    countCoin++;
                    ans.add(coins[i]);
                    totalAmount -= coins[i];
                }
            }
        }
        System.out.println("total minimum coins used = "+ countCoin);
    }
}
