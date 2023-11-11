public class arrayReverce {
    public static void arraycc(int numbers[]){
        int first = 0, last = numbers.length - 1;
        
        while (last > first) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }

    }



    public static void main(String args[]) {
        int numbers[] = { 6, 5, 4, 3, 2, 1 };
        arraycc(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}
