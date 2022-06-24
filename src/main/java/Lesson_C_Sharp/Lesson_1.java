package Lesson_C_Sharp;

import java.util.Scanner;

public class Lesson_1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MoreOrLoss();

    }
/*Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее. */

    public static void MoreOrLoss() {
        System.out.println("Введи 2 числа:");

        int a = sc.nextInt();
        int b = sc.nextInt();


        if (a > b) {
            System.out.printf("Число %s больше %s", a, b);
        } else {
            System.out.printf("Число %s больше %s", b, a);
        }

        System.out.println();

    }

}
