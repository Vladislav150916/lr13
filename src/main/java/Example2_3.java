import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int length = in.nextInt();

        byte[] array = new byte[length];
        byte sum = 0;
        System.out.println("Введите " + length + " чисел массива:");
        for (int i = 0; i < array.length; i++) {
            byte num = in.nextByte();
            array[i] = num;
            sum += num;
        }


        System.out.println("Сумма чисел массива, помещающаяся в byte:");
        System.out.println(sum);
    }
}