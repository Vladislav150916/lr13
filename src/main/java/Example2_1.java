import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int length = 0;
        boolean isLengthCorrect = false;
        while (!isLengthCorrect) {
            try {
                length = in.nextInt();
                if (length <= 0) {
                    throw new RuntimeException();
                } else {
                    isLengthCorrect = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введена строка, либо тип данных не соответствует int");
            } catch (RuntimeException re) {
                System.out.println("Ошибка. Отрицательная, либо нулевая длина массива");
            } finally {
                if (isLengthCorrect) {
                    System.out.println("Введенное значение корректно");
                } else {
                    System.out.println("Повторите ввод корректно");
                    if (in.hasNext()) {
                        in.nextLine(); //поглощаем строку, иначе упадет в бесконечный цикл
                    }
                }
            }
        }
        int[] array =  new int[length];
        long sum = 0;
        int count = 0;

        System.out.println("Введите " + length + " чисел массива:");
        boolean isArrayCorrect = false;
        while (!isArrayCorrect) {
            try {
                for (int i = 0; i < array.length; i++) {
                    int num = in.nextInt();
                    array[i] = num;
                    if (num > 0) {
                        sum += num;
                        count++;
                    }
                }
                if (count == 0) {
                    throw new ArithmeticException();
                } else {
                    isArrayCorrect = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введена строка, либо тип данных не соответствует int");
            } catch (ArithmeticException ae) {
                System.out.println("Ошибка. Количество положительных чисел = 0");
            } finally {
                if (isArrayCorrect) {
                    System.out.println("Ввод удовлетворяет требованиям для корректного завершения программы");
                } else {
                    System.out.println("Повторите ввод значений массива");
                    sum = 0;
                    count = 0;
                    if (in.hasNext()) {
                        in.nextLine(); //поглощаем строку, иначе упадет в бесконечный цикл
                    }
                }
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
