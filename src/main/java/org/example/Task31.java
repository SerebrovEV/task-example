package org.example;

//Напишите Java-программу, чтобы найти второе по величине число в массиве.
public class Task31 {
    public static void main(String[] args) {
        int[] task = {103, 102, 5, 4, 5, 6, 7, 8, 91, 14, 47, 52, 14, 25, 78, 99, 98};
       int max = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
//        for (int j : task) {
//            if (j > max) {
//                max = j;
//            }
//        }
//        for(int i : task){
//            if(i> max2 && i < max){
//                max2 = i;
//            }
//        }
     //   System.out.println(max2);

        for(int  i : task){
            if(i > max){
                max2 = max;
                max = i;
            } else if( i > max2 && i < max){
                max2 = i;
            }
        }
        System.out.println(max2);
    }
}
