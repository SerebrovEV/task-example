package org.example.decide;

import java.util.Random;

//Напишите программу которая на вход получает массив чисел и на выход отдает сумму минимального и максимального значения массива.
public class Task36 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 52, 17};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i]< min){
                min = nums[i];
            }
        }
        System.out.println(min+max);
    }
}
