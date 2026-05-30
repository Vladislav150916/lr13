package timus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class timus_1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        if (N == 0) {
            System.out.println(10);
            return;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }

        ArrayList<Integer> array = new ArrayList<>();

        for (int d = 9; d >= 2; d--) {
            while (N % d == 0) {
                array.add(d);
                N /= d;
            }
        }

        if (N != 1) {
            System.out.println(-1);
        } else {
            Collections.sort(array);
            StringBuilder result = new StringBuilder();
            for (int digit : array) {
                result.append(digit);
            }
            System.out.println(result);
        }
        in.close();
    }
}