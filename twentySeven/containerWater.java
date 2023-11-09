package twentySeven;

import java.util.ArrayList;
//Brute Force approach

 public class containerWater {
//     public static int waterStore(ArrayList<Integer> height) {
//         int maxWater = 0;
//         for (int i = 0; i < height.size(); i++) {
//             for (int j = i + 1; j < height.size(); j++) {
//                 int maxHeight = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int currentWater = maxHeight * width;
//                 maxWater = Math.max(maxWater, currentWater);
//             }
//         }
//         return maxWater;
//     }


//2 pointer approach


public static int waterCount(ArrayList<Integer> height) {
    int maxWater = 0;
    int leftPointer = 0;
    int rightPointer = height.size() - 1;

    while (leftPointer < rightPointer) {
        int ht = Math.min(height.get(leftPointer), height.get(rightPointer));
        int width = rightPointer - leftPointer;
        int currentWater = ht * width;
        maxWater = Math.max(maxWater, currentWater);

        if (height.get(leftPointer) < height.get(rightPointer)) {
            leftPointer++;
        } else {
            rightPointer--;
        }
    }
    return maxWater;
}
    


    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(waterCount(height));
    }
}
