package AlexeyBasalay.HomeWork.lesson2.HomeWork2;

import java.util.Scanner;

/**
 * 1. Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class HW_Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scanner.nextInt();
        int result = Sum(value);
        System.out.println(result);

    }
    public static int Sum(int value){
        int result = 0;
        for (int inputValue = value; inputValue != 0 ; inputValue /= 10) {
            result += inputValue % 10;
        }
        return result;
    }
}
