package ru.FreyllaR;

import java.util.Scanner;
import java.util.ArrayList;


    public class Main {

        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n % 10 != 0 & n % 9 != 0 & n % 5 != 0) {
                if ((n - 1) % 10 == 0) {
                    for (int i = 0; i < (n - 1) / 10; i++) {
                        list1.add(10);
                    }
                    list1.add(1);
                }
                if ((n - 1) % 9 == 0) {
                    for (int i = 0; i < (n - 1) / 9; i++) {
                        list1.add(9);
                    }
                    list1.add(1);
                }
                if ((n - 1) % 5 == 0) {
                    for (int i = 0; i < (n - 1) / 5; i++) {
                        list1.add(5);
                    }
                    list1.add(1);
                }
                } else {
                    if (n % 10 == 0) {
                        for (int i = 0; i < n / 10; i++) {
                            list1.add(10);
                        }
                    } else if (n % 9 == 0) {
                        for (int i = 0; i < n / 9; i++) {
                            list1.add(9);
                        }
                    } else if (n % 5 == 0) {
                        for (int i = 0; i < n / 5; i++) {
                            list1.add(5);
                        }
                    }
                }

                while (n >= 10) {
                    n -= 10;
                    list2.add(10);
                }
                while (n >= 9) {
                    n -= 9;
                    list2.add(9);
                }
                while (n >= 5) {
                    n -= 5;
                    list2.add(5);
                }
                while (n >= 1) {
                    n -= 1;
                    list2.add(1);
                }

            if(list1.size() < list2.size()){
                for(Integer x : list1){
                    System.out.println(x);
                }
            }else{
                for(Integer y : list2){
                    System.out.println(y);
                }
            }
        }

        private static int getFirstInt() {
            Scanner scanner = new Scanner(System.in); //можно считывать числа с консоли(руками тоже)
            int FirstInt = scanner.nextInt();
            return FirstInt;
        }
    }