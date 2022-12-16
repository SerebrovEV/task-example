package org.example.decide;
//Напишите пример перехвата и обработки исключения в блоке try-catch метода.
public class Task7 {
    public static void main(String[] args){
        System.out.println("Работа начата");
        throw new NullPointerException();
//        try{
//            System.out.println("Работа начата");
//            throw new NullPointerException();
//        }catch(NullPointerException e){
//            System.out.println("Введен нуль!!");
//        }
       // System.out.println("Работа завершина.");
    }
}
