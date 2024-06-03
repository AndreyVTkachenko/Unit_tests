package lessons.lesson_01;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    public static void main(String[] args) {
        /*
        System.out.printf("Результат операции: %s\n", calculation(2, 2, '+'));
        System.out.printf("Результат операции: %s\n", calculation(4, 2, '-'));
        System.out.printf("Результат операции: %s\n", calculation(8, 2, '/'));
        System.out.printf("Результат операции: %s\n", calculation(3, 2, '*'));
        System.out.println("_______________________________________________________________________________");
         */

//        if (4 != Calculator.calculation(2, 2, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(4, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (4 != Calculator.calculation(8, 2, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (6 != Calculator.calculation(3, 2, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }

        // Те же проверки с использованием assert
        assert 4 == Calculator.calculation(2, 2, '+');
        assert 2 == Calculator.calculation(4, 2, '-');
        assert 4 == Calculator.calculation(8, 2, '/');
        assert 9 == Calculator.calculation(3, 2, '*');

//        try {
//            Calculator.calculation(8, 4, '_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Unexpected value operator: _")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
    }
}
