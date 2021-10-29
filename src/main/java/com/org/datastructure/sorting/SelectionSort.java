package com.org.datastructure.sorting;

public class SelectionSort {

    public int [] sort(int [] arr, int len){
        int k=0;
        for(k=0;k<len;k++);{

            int index = k;
            for(int j=k+1;j<len;j++){
                if(arr[index]>arr[j])
                    index = j;
            }
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
