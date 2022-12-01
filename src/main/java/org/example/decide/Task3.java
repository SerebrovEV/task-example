package org.example.decide;
//Напишите программу в простом текстовом редакторе, которая проверяет, является ли строка палиндромом.
public class Task3 {
    public static void main(String[] args){
        String example = "avcycva";
        System.out.println(example);
        boolean isPalindrome = true;
        for(int i = 0; i < example.length()/2; i++ ){
            if(!(example.charAt(i) == example.charAt(example.length()-1-i))){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
