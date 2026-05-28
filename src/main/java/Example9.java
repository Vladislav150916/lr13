public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Добавлена обработка исключения, теперь программа не крашнется");
        } finally {
            System.out.println("1");
        }
        return 2; //После добавления обработки исключения нужно добавить return для того, чтобы компилятор не выдал ошибку
    }

    static void main(String[] args) {
        System.out.println(m());
    }
}

