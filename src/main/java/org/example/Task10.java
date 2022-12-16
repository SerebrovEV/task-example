package org.example;
//Напишите пример обработки нескольких исключений в одном блоке catch.
public class Task10 {

    public static void main(String[] args){

        try{
           System.out.println("Start");
           throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
    System.out.println("Catch is working");
        }
        System.out.println("Final");
    }
}
