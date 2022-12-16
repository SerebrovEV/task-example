package org.example.decide;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
На входе коллекция пользователей.
Необходимо удалить все дубли (одинаковое имя и возраст).
Отсортировать по возрасту и имени.
Вернуть самого старого пользователя.
*/
public class Task14 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User("abc", 10),
                new User("ab", 11),
                new User("ac", 12),
                new User("vb", 10),
                new User("anb", 11),
                new User("abc", 16),
                new User("av", 11),
                new User("abc", 10),
                new User("abc", 10),
                new User("abf", 11),
                new User("abf", 11),
                new User("abc", 15)));
        System.out.println(users);
        System.out.println(oldUser(users));

    }

    private static User oldUser(Collection<User> users) {
        List<User> listUsers = new ArrayList<>(users);
        for (int i = 0; i < listUsers.size(); i++) {
            for (int j = i + 1; j < listUsers.size(); j++) {
                if (listUsers.get(i).getName().equals(listUsers.get(j).getName())
                        && listUsers.get(i).getAge() == listUsers.get(j).getAge()) {
                    listUsers.remove(j);
                }
            }
        }
        List<User> list2 = users.stream()
                .distinct()
                .sorted(Comparator.comparing(User::getName).thenComparing(User::getAge))
                .toList();
        System.out.println(list2);
        listUsers = listUsers.stream()
                .sorted(Comparator.comparing(User::getName).thenComparing(User::getAge))
                .toList();
        System.out.println(listUsers);
        User user = listUsers.stream()
                .max(Comparator.comparing(User::getAge))
                .get();

        return user;
    }

    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
}
