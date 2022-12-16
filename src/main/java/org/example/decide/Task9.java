package org.example.decide;
//Напишите пример перехвата и обработки исключения с использованием собственных исключений.
public class Task9 {
    public static void main(String[] args){
        try{
            System.out.println("Start");
            throw new ExampleException();

//        }catch(ExampleException e){
//            System.out.println("Catch 1");
        }catch(Example2Exception e2) {
           System.out.println("Catch 2");
        }

        System.out.println("End");

    }

    public static class ExampleException extends RuntimeException {

    }

    public class Example2Exception extends RuntimeException {

    }
}
