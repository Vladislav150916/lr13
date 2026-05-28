public class Example9 {
    public static int m() {
        try {
            System.out.println("0");
            throw new Exception("Добавлена генерация исключения");
        } catch (Exception e) {
            System.out.println("Добавлена обработка исключения");
        } finally {
            System.out.println("1");
        }
        return 99; //добавлен выход из метода
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

