package com.org.datastructure;

public class QuickSort {

    public void qSort(int [] arr, int low, int high){

        if(low < high){
            Integer partition = partition(arr, low, high);
            qSort(arr,low,partition-1);
            qSort(arr,partition+1,high);
        }
    }

    private Integer partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for(int j = low;j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }

}
