package com.tasks;

public class StringPermutatation {
    public static void dispArray(Character arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static int fact(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        String str = "ABC";
        Character [] arr = new Character[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i]=str.charAt(i);
        }
        dispArray(arr);
    }
}
