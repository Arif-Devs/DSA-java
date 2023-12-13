

import java.util.ArrayList;

import java.util.Collections;


public class arrayList {
    public static void swap(ArrayList<Integer>list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < list.size(); i++) {
    //         if (max < list.get(i)) {
    //             max = list.get(i);
    //         }
    //     }
    //     System.out.println(max);
    //swap
    // int index1 = 1, index2 = 3;
    // System.out.println(list);
    // swap(list, index1, index2);
    // System.out.println(list);

    System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);

    Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
