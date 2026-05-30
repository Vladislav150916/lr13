import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example2_2_obrabotka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isSizeCorrect = false;
        int a = 0;
        int b = 0;
        while (!isSizeCorrect) {
            try {
                System.out.println("Введите количество строк в матрице:");
                a = in.nextInt();
                System.out.println("Введите количество столбцов в матрице:");
                b = in.nextInt();
                if (a <= 0 || b <= 0) {
                    throw new RuntimeException();
                }
                isSizeCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введена строка, либо тип данных не соответствует int");
            } catch (RuntimeException re) {
                System.out.println("Ошибка. Отрицательное, либо нулевое количество строк или столбцов");
            } finally {
                if (isSizeCorrect) {
                    System.out.println("Введенные значения корректны");
                } else {
                    System.out.println("Повторите ввод корректно");
                    if (in.hasNext()) {
                        in.nextLine();
                    }
                }
            }
        }
        int[][] matrix = new int[a][b];

        System.out.println("Матрица заполняется случайными числами. Получена матрица:");
        Random r = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                matrix[i][j] = r.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Введите индекс столбца матрицы, который хотите получить");
        int c = -1;
        boolean isNumCorrect = false;
        while (!isNumCorrect) {
            try {
                c = in.nextInt();
                if (c < 0 || c >= b) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                isNumCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введена строка, либо тип данных не соответствует int");
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Ошибка. Введен отрицательный индекс, либо индекс выходящий за размер массива");
            } finally {
                if (isNumCorrect) {
                    System.out.println("Введено корректное значение");
                } else {
                    System.out.println("Повторите ввод корректно");
                    if (in.hasNext()) {
                        in.nextLine();
                    }
                }
            }
        }
        System.out.println("Столбец с иднексом " + c + ":");
        for (int i = 0; i < a; i++) {
            System.out.println(matrix[i][c]);
        }
    }
}
