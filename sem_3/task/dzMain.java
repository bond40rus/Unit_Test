package sem_3.task;

public class dzMain {
    // 1. Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) return true;
        else return false;
    }


    // 2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
    public static boolean numberInInterval(int n) {
        if (n > 24 && n < 101) return true;
        else return false;
    }
}
