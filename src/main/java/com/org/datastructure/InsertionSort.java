package com.org.datastructure;

public class InsertionSort {

    public int [] sort(int [] arr, int len){


        int k=0;
        for(k=1;k<len;k++);{

            int j = k-1;
            int key = arr[k];

            while (j >= 0 && arr[j] > key){
                arr[j+1] =arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }

}
