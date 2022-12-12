package org.example;
//Напишите Java-программу для проверки, является ли введенное число числом Армстронга.
public class Task32 {
    public static void main(String[] args){
        int task = 153;
        int task2 = task;
        int sum = 0;
        int length = String.valueOf(task).length();
        int length2 = (int) (Math.log10(task) + 1);
        while(task2 % 10 > 0 ){
            sum += Math.pow(task2 % 10, length);
            task2 = task2/10;
            System.out.println(task2);
            System.out.println("sum " + sum);
        }

        System.out.println(sum == task);
    }
}
