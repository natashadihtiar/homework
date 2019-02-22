package natashadihtiar;

import java.io.Console;
import java.util.Scanner;

public class Main {


    private static void Example_1() {
        // Создаём экземпляр класса Scanner для считывания данных, введенных пользователем
        System.out.println("\nПример 1\n");

        Scanner scanner = new Scanner(System.in);

        double number1, number2;
        double answer1, answer2;

        System.out.println("Введите первое число: " );

        number1 = scanner.nextDouble();
        System.out.println("Введите второе число(степень, в которую будет возводиться число): " );
        number2 = scanner.nextDouble();

        answer1 = Math.pow(number1, number2);

        System.out.println("Возведение числа в указанную степень: " +  answer1);

        answer2 = Math.sqrt(answer1);

        System.out.println("Квадратный корень числа: " +  answer2);

    }

    private static void Example_2() {
        System.out.println("\nПример 2\n");
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x1, x2, x;
        double D;

        System.out.println("Программа решает квадратное уравнение вида: ax^2 + bx + c = 0);");

        System.out.println("Введите a: ");
        a = scanner.nextDouble();

        System.out.println("Введите b: ");
        b = scanner.nextDouble();

        System.out.println("Введите c: ");
        c = scanner.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {

            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Первый корень уравнения х1 = " + x1);
            System.out.println("Второй корень уравнения х2 = " + x2);
        }
        else if (D < 0) {
            System.out.println("Уравнение не имеет действительных корней!");
        } else {
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
    }


    public static void main(String[] args) {

        Example_1();
        Example_2();
    }
}
