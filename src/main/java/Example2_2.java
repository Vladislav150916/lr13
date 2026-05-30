import java.util.Random;
import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк в матрице:");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов в матрице:");
        int b = in.nextInt();

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
        int c = in.nextInt();

        System.out.println("Столбец с индексом " + c + ":");
        for (int i = 0; i < a; i++) {
            System.out.println(matrix[i][c]);
        }
    }
}