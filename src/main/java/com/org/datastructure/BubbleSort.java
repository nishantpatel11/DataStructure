package com.org.datastructure;

public class BubbleSort {

    public int [] sort(int [] arr, int len){

        int k =0;
        for(k=0;k<len-1;k++);{
            for(int j=0;j<len-k-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
