import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2_3_obrabotka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int length = 0;
        boolean isLengthCorrect = false;
        while (!isLengthCorrect) {
            try {
                length = in.nextInt();
                if (length <= 0) {
                    throw new NegativeArraySizeException();
                } else {
                    isLengthCorrect = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введена строка, либо тип данных не соответствует int");
            } catch (NegativeArraySizeException re) {
                System.out.println("Ошибка. Отрицательная, либо нулевая длина массива");
            } finally {
                if (isLengthCorrect) {
                    System.out.println("Введенное значение корректно");
                } else {
                    System.out.println("Повторите ввод корректно");
                    if (in.hasNext()) {
                        in.nextLine();
                    }
                }
            }
        }

        byte[] array = new byte[length];
        int sum = 0;
        System.out.println("Введите " + length + " чисел массива:");
        boolean isArrayCorrect = false;
        while (!isArrayCorrect) {
            try {
                for (int i = 0; i < array.length; i++) {
                    byte num = in.nextByte();
                    array[i] = num;
                    sum += num;
                }
                if (sum > 127 || sum < -128) {
                    throw new ArithmeticException();
                }
               isArrayCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введена строка, либо тип данных не соответствует byte");
            } catch (ArithmeticException ae) {
                System.out.println("Ошибка. Сумма чисел массива выходит за пределы byte");
            } finally {
                if (isArrayCorrect) {
                    System.out.println("Ввод удовлетворяет требованиям для корректного завершения программы");
                } else {
                    System.out.println("Повторите ввод значений массива");
                    sum = 0;
                    if (in.hasNext()) {
                        in.nextLine();
                    }
                }
            }
        }
        System.out.println("Сумма чисел массива, помещающаяся в byte:");
        System.out.println((byte) sum);
    }
}
