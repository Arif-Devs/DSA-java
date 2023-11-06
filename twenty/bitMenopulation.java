package twenty;

public class bitMenopulation {
    public static void checkEvenodd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    //Get ith bit

    public static int getIthbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //Set ith bit
    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    //Clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // clear last i bit
    public static int clearIbit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        //checkEvenodd(3);
        //System.out.println(getIthbit(5, 2));
        //System.out.println(setithBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        System.out.println(clearIbit(15, 2));
    }
}
