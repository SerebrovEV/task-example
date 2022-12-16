package org.example.decide;
//Напишите Java-программу для удаления всех пробелов из строки с помощью replace().
public class Task33 {
    public static void main(String[] args){
        String task = "a b c v nm mf dg";
        task = task.replace(" ", "");
        System.out.println(task);
    }
}
