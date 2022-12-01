package org.example.decide;

import java.util.Arrays;

//Напишите программу, которая переворачивает массив.
public class Task2 {

    public static void main(String[] args) {
        int[] task = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,22};
        System.out.println(Arrays.toString(task));
        int tmp;
        for (int i = 0; i < task.length/2; i++){
            tmp = task[i];
            task[i] = task[task.length-1 -i];
            task[task.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(task));
    }
}
