package com.block123;

public class MainRecursion {
    public static void main(String[] args) {
 /*       f(1);
        System.out.println("END");
    }

    private static void f(int k) {
        System.out.println(k);
        if (k < 7) {
            f(2 * k);
        }
*/
/*
        f(99);
    }
    private static void f (int k) {
        if (k<=100) {
            System.out.println("k= "+ k);
            f(++k);
            System.out.println(" will be "+k);
        }
*/

/*

int c = 5;
int a = 4;
int b = 5;
int f = c ^ b;
        System.out.println(f);
        System.out.println(5^6&3);

*/

        int a[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum+=a[i];
        System.out.println(sum);

    }


}
