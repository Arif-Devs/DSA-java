public class function {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
// find factorial
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // binomial coefficient

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

        }
        //Find prime number

        public static boolean isPrime(int n) {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            return isPrime;
        }
          
        //find prime in range
          
        public static void prime(int n) {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
           
        //Binary to decimal

        public static void biTodec(int binNum) {
            int myNumber = binNum;
            int pow = 0;
            int decNum = 0;
            while (binNum > 0) {
                int lastNum = binNum % 10;
                decNum = decNum + (lastNum * (int) Math.pow(2, pow));

                pow++;
                binNum = binNum / 10;
            }
            System.out.println("Decimel of " + myNumber + " Number is " + decNum);
        }

        //Decimal to binary
        public static void decTobi(int n) {
            int myNumber = n;
            int pow = 0;
            int biNum = 0;
            while (n > 0) {
                int rem = n % 2;
                biNum = biNum + (rem * (int) Math.pow(10, pow));

                pow++;
                n = n / 2;
            }
            System.out.println("Binary Number of " + myNumber + " = " + biNum);
        }
        
        //Question 2 find even 

        public static void isEven(int n) {
            if (n % 2 == 0) {
                System.out.print("Even Number");
            } else {
                System.out.print(" Not Even Number");
            }
        }
        
        //Question 3 Write a Java program to check if a number is a palindrome

        public static boolean palinDrome(int n) {
            int temp = n;
            int rev =0;
            while (temp != 0) {
                rev = rev*10+(temp % 10);
                temp = temp / 10;

            }
            if (rev == n) {
                
                return true;
            } else {
                
                return false;
            }
        }


            public static void main(String args[]) {
                int num = 131;
                if (palinDrome(num)) {
                    System.out.println("palindrome");
                } else {
                    System.out.println("Not palindrome");
                }
            }
        }









