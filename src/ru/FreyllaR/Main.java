package ru.FreyllaR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 10 != 0 & n % 9 != 0 & n % 5 != 0) {
            if((n - 1) % 10 == 0) {
                for (int i = 0; i < (n - 1) / 10; i++) {
                    System.out.println(10);
                }
                System.out.println(1);
                return;
            }
            if((n - 1) % 9 == 0){
                for (int i = 0; i < (n - 1) / 9; i++) {
                    System.out.println(9);
                }
                System.out.println(1);
                return;
            }
        if((n - 1) % 5 == 0) {
            for (int i = 0; i < (n - 1) / 5; i++) {
                System.out.println(5);
            }
            System.out.println(1);
            return;
        }else {
            while (n >= 10) {
                n -= 10;
                System.out.println(10);
            }
            while (n >= 9) {
                n -= 9;
                System.out.println(9);
            }
            while (n >= 5) {
                n -= 5;
                System.out.println(5);
            }
            while (n >= 1) {
                n -= 1;
                System.out.println(1);
            }
        }
        } else {
            if (n % 10 == 0) {
                for (int i = 0; i < n / 10; i++) {
                    System.out.println(10);
                }
                return;
            } else if (n % 9 == 0) {
                for (int i = 0; i < n / 9; i++) {
                    System.out.println(9);
                }
                return;
            } else if (n % 5 == 0) {
                for (int i = 0; i < n / 5; i++) {
                    System.out.println(5);
                }
                return;
            }
        }
}

    private static int getFirstInt() {
        Scanner scanner = new Scanner(System.in); //можно считывать числа с консоли(руками тоже)
        int FirstInt = scanner.nextInt();
        return FirstInt;
    }
}
