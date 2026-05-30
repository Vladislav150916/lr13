import java.util.Arrays;
import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int length = in.nextInt();

        int[] array = new int[length];
        long sum = 0;
        int count = 0;

        System.out.println("Введите " + length + " чисел массива:");
        for (int i = 0; i < array.length; i++) {
            int num = in.nextInt();
            array[i] = num;
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        in.close();
        System.out.println("Ваш массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Среднее значение положительных чисел массива: ");
        double result = (double) sum / count;
        System.out.println(result);
    }
}