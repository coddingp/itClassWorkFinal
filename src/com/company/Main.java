package com.company;

import java.util.Arrays;

public class Main {
    public static int[] ARRAY = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ARRAY));

        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[i] = i + 10;
        }
//        System.out.println(Arrays.toString(ARRAY1));
        int[] ARRAY1 = ARRAY;
        System.out.println(Arrays.toString(ARRAY1));
        ARRAY=new int[20];
        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[i] = i + 20;
        }
        System.out.println(Arrays.toString(ARRAY));
    }
}
