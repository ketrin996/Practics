package com.company;

public class Main {

    public static void main(String[] args) {
        print(args);
        sort(args);
        print(args);
    }

    public static void print(String[] args) {
        for(String i:args) {
            System.out.println(i);
        }
    }

    public static void sort(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            for (int j = 1+i; j < args.length; j++) {

                if (args[j].compareTo(args[i]) < 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
    }


}
