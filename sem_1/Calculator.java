package sem_1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Нельзя делить на ноль");
                }
            default:
                throw new IllegalStateException("не правельный оператор" + operator);
        }
        return result;
    }


    public static double squareRootExtraction(double num) {

        if (num < 0) {
            throw new IllegalArgumentException("Нельзя вычесть корень из отрицательного числа");
        }
        return Math.sqrt(num);
    }


    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        double resultAmount = purchaseAmount - ((double) discountAmount / 100 * purchaseAmount);
        if (purchaseAmount < 1)
            throw new IllegalArgumentException("Сумма покупок не может быть меньше 1 usd");
        if (discountAmount < 0) throw new IllegalArgumentException("Процент скидки не может быть отрицательным");
        return resultAmount; //
    }
}