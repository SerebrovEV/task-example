package org.example.decide;

import java.util.HashMap;
import java.util.HashSet;

//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.
public class Task26 {
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
        HashSet<String> task26 = new HashSet<>(tasks.values());
        System.out.println(task26.size());
    }
}