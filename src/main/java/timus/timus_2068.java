package timus;

import java.util.Scanner;

public class timus_2068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countMod3 = 0;
        for (int i = 0; i < n; i++) {
            int nuts = scanner.nextInt();
            if (nuts % 4 == 3) {
                countMod3++;
            }
        }
        if (countMod3 % 2 == 1) {
            System.out.println("Daenerys");
        } else {
            System.out.println("Stannis");
        }
    }
}