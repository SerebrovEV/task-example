package org.example.decide;
//Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу.
public class Task8 {

    public static void main(String[] args){
        System.out.println("Start");
        example();

//        try{
//
//        }catch(RuntimeException e){
//            System.out.println("Catch is working");
//        }
        System.out.println("End");
    }

    public static void example() throws RuntimeException{
        int a = 0;
        System.out.println("Method work");
        throw new RuntimeException();
    }
}
