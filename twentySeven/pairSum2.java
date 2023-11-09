package twentySeven;

import java.util.ArrayList;

public class pairSum2 {
    public static boolean pair(ArrayList<Integer> list, int target) {
        int breakPoint = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakPoint = i;
                break;
            }
        }
      
        int lp = breakPoint + 1;
        int rp = breakPoint;

        
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp)+list.get(rp) < target) {
                lp = (lp+1)%n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;





    }
        public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;
     
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
       
        System.out.println(pair(list, target));
    }
}
