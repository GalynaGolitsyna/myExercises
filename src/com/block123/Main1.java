package com.block123;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Stuff stuff = new Stuff();
        System.out.println(stuff.oddOrNot(5));


        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("(" + i + "),(" + j + ")");
            }
            System.out.println();
        }

/*        int[] arr = {10, 20, 30, 40};
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }*/

        int[] arr1 = {0, 1, 2, 3, 4};
        for (i = arr1.length - 1; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }

        int[] arr2 = {0, 1, 2, 3, 4};
        for (i = arr2.length - 1; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print(arr2[j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr2.length - i; j++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }

        for (i = arr2.length - 1; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                System.out.print(arr2[j] + " ");
            }
            System.out.println();
        }

 /*       int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            swap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;*/


        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            swap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }

}



