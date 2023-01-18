package com.tasks;

public class Arr {
    public static void dispArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println("Original array");
        dispArray(arr);
        int n = 0;
        int temp;
        while(n < 2){   //2 because we need to rotate 2 positions
            for(int i=0; i<arr.length-1; i++){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            n++;
        }
        System.out.println("Rotated array");
        dispArray(arr);
    }
}
