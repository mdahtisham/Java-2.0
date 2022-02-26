package com.company;

public class bubbleSort {
    public static void main(String[] args) {
        int a[] = {2, 4, 7, 1, 9, 7, 3, 8, 4, 5, 1, 0, 3};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1; j++) {

                if (a[j+1] < a[j]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int item: a){
            System.out.print(item+" ");
        }
    }
}
