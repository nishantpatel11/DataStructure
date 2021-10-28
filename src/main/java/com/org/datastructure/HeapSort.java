package com.org.datastructure;

public class HeapSort {


    public void heapSort(int [] arr, int len){

        for(int i = len/2-1; i >= 0; i--)
            heapify(arr,len,i);

        for(int i = len-1; i > 0;i--)  {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] =temp;
            heapify(arr,i,0);
        }
    }

    private void heapify(int[] arr, int n, int i) {

        int largest = i;
        int l = i*2+1;
        int r = i*2+2;

        if(l<n && arr[l]>arr[largest])
            largest = l;

        if( r < n && arr[r] > arr[largest])
            largest = r;

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,n,largest);
        }
    }

}
