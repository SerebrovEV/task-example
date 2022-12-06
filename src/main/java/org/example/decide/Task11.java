package org.example.decide;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeSet;

//Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
public class Task11 {
    private static String[] lists = {" w", " a", " b", " g", " s", " s", " w", " a", " b", " g", " s", " s", " w", " a"};

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(List.of(lists));
        System.out.println(treeSet);
        String result ="";
        for(int i=0; i<lists.length; i++){

            for(int j =i+1; j<lists.length; j++)
                if(lists[i] != null && lists[i].equals(lists[j])){
                    lists[j] = null;
                }
            if(lists[i] != null)  result = result + lists[i];
        }
        System.out.println(result);
    }
}
