/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Sort {

    public static void main(String[] args) {
        // TODO code application logic here     
        int a[] = {32, 17, 49, 98, 6, 25, 53, 61};
//        selectionSort(a);
//        insertionSort(a);
//        bubleSort(a);
        quick(0, a.length - 1, a);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] a) {
        int i, j, k, temp;
        for (i = 0; i < a.length; i++) {
            k = i;
            for (j = i + 1; j < a.length; j++) {
                System.out.println(a[j]);
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
    }

    private static void insertionSort(int[] a) {
        int i, j, k, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;
            while ((j >= 0) && (a[j] > temp)) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    private static void bubleSort(int[] a) {
        int i, j, temp;
        boolean noExchange;
        i = 1;
        do {
            noExchange = false;
            for (j = a.length - 1; j >= i; j--) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    noExchange = true;
                }
            }
            i++;
        } while ((i == a.length - 1) || (noExchange));
    }

    private static void quick(int left, int right, int[] a) {
        int i = left, j = right, temp, origin = a[left];
        while (i <= j) {
            while ((a[i + 1] < origin) && i < right) {
                i++;
            }
            while ((a[j] > origin) && j > left) {
                j--;
            }
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quick(left, j, a);
        }
        if (i < right) {
            quick(i, right, a);
        }
    }
}
