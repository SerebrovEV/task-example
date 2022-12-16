package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

//Напишите программу на Java для вычисления серии чисел Фибоначчи.
public class Task28 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        List<Long> numbers = new ArrayList<>();
        List<Long> numbers2 = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers2.add(a);
        numbers2.add(b);
        long sum;
        for (long i = 0; i < 1_000; i++) {
            sum = a + b;
            a = b;
            b = sum;
            numbers.add(b);
        }
        Thread thread = new Thread(() -> {
            long a2 = 0;
            long b2 = 1;
            long sum2;
            for (long i = 0; i < 1_000; i++) {
                sum2 = a2 + b2;
                a2 = b2;
                b2 = sum2;
                numbers2.add(b2);
            }
        });
        thread.start();
        System.out.println(numbers);
        System.out.println(numbers2);
    }
}
