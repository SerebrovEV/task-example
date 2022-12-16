package org.example.decide;

import java.util.ArrayList;
import java.util.List;

//Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for.
public class Task29 {
    public static void main(String[] args){
        ArrayList<Integer> task = new ArrayList<>(List.of(1, 2, 25 ,2,14 ,3,4,5,5,6,7,2, 43));

        for(int i= 0; i< task.size(); i++){
            System.out.print(task.get(i) + " ");
        }
        System.out.println();
        int j= 0;
        while(j<task.size()){
            System.out.print(task.get(j)+ " ");
            j++;
        }
        System.out.println();
        for (Integer integer : task) {
           System.out.print(integer + " ");
        }
    }
}
