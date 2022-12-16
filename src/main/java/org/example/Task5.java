package org.example;
//Напишите пример Enum.
public class Task5 {
    public enum School{
        STUDENT,
        TEACHER,
        DIRECTORY,
        SAFEMAN
    }
    public static void main(String...args){
        //bar();
        foo();
    }
//    static void bar() {
//        int[] nums = {1, 2, 3};
//       // int x;
//        for ( x = 0; x < nums.length; x++ ) {
//            x += nums[x];
//        }
//        System.out.println(x);
//    }

    static void foo() {
        String m = "Hello";
        System.out.print(m);
        bar2(m);
        System.out.print(m);
    }

    static void bar2(String m) {
        m += " World!";
    }


}
