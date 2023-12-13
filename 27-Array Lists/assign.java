

import java.util.ArrayList;




public class assign {
    public static int countMax(ArrayList<Integer> num,  int target) {
        int count[] = new int[1001];
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i - 1) == target) {
                count[num.get(i)]++;
            }
        }
        
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;

    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(3);
        num.add(3);
        num.add(2);

        System.out.println(countMax(num, 2));
    }
}
