

public class pairing {
    public static int friendPairing(int n) {
        if (n == 1 || n == 2) {
            
            return n;
        }
        //Single 
        int findSingle = friendPairing(n - 1);
        
        //pair
        int findPair = friendPairing(n - 2);
        int pairWays = (n - 1) * findPair;

        //findWays
        int totalWays = findSingle + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(4 ));
    }
}
