package org.example.decide;

import java.util.HashMap;
import java.util.Map;

//Создать метод, который преобразует массив объектов User (c полями name, age, phone) в карту Номер телефона -› Имя пользователя.
public class Task17 {

    private static class User {
        private String name;
        private int age;
        private int phone;

        public User(String name, int age, int phone) {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public int getPhone() {
            return this.phone;
        }
    }

    private static User user1 = new User("a", 10, 100);
    private static User user2 = new User("b", 11, 101);
    private static User user3 = new User("c", 12, 102);
    private static User user4 = new User("d", 13, 103);
    private static User user5 = new User("e", 14, 104);
    private static User user6 = new User("f", 15, 105);
    private static User user7 = new User("j", 16, 106);
    private static User[] users = {user1, user2, user3, user4, user5, user6, user7};


    public static void main(String[] args) {
        System.out.println(makePhoneBook(users));
    }

    private static Map<Integer, String> makePhoneBook(User[] users) {
        Map<Integer, String> phoneBook = new HashMap<>();
        for (User user : users) {
            phoneBook.put(user.getPhone(), user.getName());
        }
        return phoneBook;
    }

}
