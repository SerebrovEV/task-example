package org.example.decide;

import java.util.HashMap;

//Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.
public class Task27 {

    public static void main(String[] args) {
        HashMap<Integer, String> tasks = new HashMap<>();
        tasks.put(1, "a");
        tasks.put(2, "as");
        tasks.put(3, "an");
        tasks.put(4, "ah");
        tasks.put(5, "ad");
        tasks.put(6, "ad");
        tasks.put(7, "ag");
        tasks.put(8, "an");
        int i = 1;
        while (i < tasks.size()) {
            System.out.println(tasks.get(i));
            i++;
        }
// decided
        for(String task : tasks.values()){
            System.out.println(task);
        }
    }
}
