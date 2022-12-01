package org.example.decide;

import java.util.Arrays;

//Необходимо реализовать следующий метод:
//Получаем на входе массив чисел.
//Все четные числа увеличиваем на единицу.
//Возвращаем кусок списка с 3-го по 7-й элемент.
public class Task14 {
    private static int[] INTS = {1,11,30,54,6,8,10,22,36,25};
    public static void main(String[] args){
        System.out.println("\n" + Arrays.toString(decide(INTS)));
    }

    private static int[] decide(int[] task){
        for(int i = 0; i<task.length; i++){
            if(task[i] % 2 == 0){
                task[i] += 1;
            }
        }
        System.out.print(Arrays.toString(task));
        return Arrays.copyOfRange(task, 3, 7);
    }
}
