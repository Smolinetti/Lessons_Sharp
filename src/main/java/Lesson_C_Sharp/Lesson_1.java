package Lesson_C_Sharp;

import java.util.Scanner;

public class Lesson_1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //moreOrLoss();
        //maxFromNumbers();
        evenNumber();


    }


    /*Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее. */

    public static void moreOrLoss() {
        System.out.println("Введи 2 числа:");

        int a = sc.nextInt();
        int b = sc.nextInt();


        if (a > b) {
            System.out.printf("Число %s больше %s.", a, b);
        }
        if (a < b) {
            System.out.printf("Число %s больше %s.", b, a);
        } else {
            System.out.printf("Число %s равно %s.", a, b);
        }

        System.out.println();

    }



    /*Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.*/

    private static void maxFromNumbers() {
        int max = 0;

        System.out.println("Введи 3 числа:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            max = a;
        }
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.printf("Максимальное число %s.", max);
        System.out.println();
    }


    /*Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).*/

    private static void evenNumber() {
        System.out.println("Введи число:");

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.printf("Число %s является четным.", a);
        } else {
            System.out.printf("Число %s является НЕчетным.", a);
        }
    }
}
