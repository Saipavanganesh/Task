package com.tasks;

public class StringPermutatation {
    public static void dispArray(Character arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        String str = "ABCD";
        int a =0;
        char temp;
        Character [] arr = new Character[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i]=str.charAt(i);
        }

        while(a < str.length()){
            for(int i=0; i<arr.length-1; i++){
                dispArray(arr);
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                System.out.println();
            }
            a++;
        }
    }
}
