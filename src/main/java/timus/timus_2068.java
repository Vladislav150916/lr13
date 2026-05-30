package timus;

import java.util.Scanner;

public class timus_2068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int countMod3 = 0;
        for (int i = 0; i < n; i++) {
            int nuts = in.nextInt();
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