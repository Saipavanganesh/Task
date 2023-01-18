package com.tasks;

public class ArrayIntersection {
    public static void dispArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5,6};
        int[] arr2 = new int[] {1,2,3,7,8,9};
        System.out.println("Array 1");
        dispArray(arr1);
        System.out.println("Array 2");
        dispArray(arr2);
        System.out.println("Arrays intersection");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
