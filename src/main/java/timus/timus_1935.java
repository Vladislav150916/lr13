package timus;

import java.util.Scanner;

public class timus_1935 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            sum += a;
            if (a > max) {
                max = a;
            }
        }
        System.out.println(sum + max);
        in.close();
    }
}