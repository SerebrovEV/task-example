package org.example.decide;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Дан List ‹String› names. Удалите первую букву из каждого имени и верните отсортированный список.
public class Task1 {

    private static List<String> names = new ArrayList<>(List.of("a2", "b1", "c3", "d4", "e5", "f10", "e7", "i8"));

    public static void main(String[] args) {
        System.out.println(names);
        String tmp;
        for(int i =0; i < names.size(); i++){
            tmp = names.get(i).substring(1);
            names.set(i, tmp);
        }
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
    }
}
