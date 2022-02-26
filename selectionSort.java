package com.company;

public class selectionSort {
    public static void main(String[] args){
        int a[] ={9,5,1,0,4,7,1,9,5,1,0,5,8,5,1,4,9,8,5,3};
        int n = a.length;

        for (int i=0; i<n-1; i++){

            int minIndex = i;
            for (int j=i; j<n; j++){

                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for(int e: a){
            System.out.print(e+" ");
        }

    }
}
