package org.example.decide;

//Напишите Java-программу для удаления всех пробелов из строки без использования replace().
public class Task34 {
    public static void main(String[] args) {
        String task = "a b c v nm mf dg";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < task.length(); i++) {
            if (!(task.charAt(i) == ' ')) {
                stringBuilder.append(task.charAt(i));
            }
        }
        task = String.valueOf(stringBuilder);
        System.out.println(task);
    }
}