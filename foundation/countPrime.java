package foundation;

import java.util.Scanner;

public class countPrime {
    public static int countPrimes(int n) {
        int count = 0;
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        // int i = 2;
        // while(i < n){
        //     if(i)
        // }
        return count;

    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i  < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countPrimes(n);
        System.out.println(res);

    }
}
