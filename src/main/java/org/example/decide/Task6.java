package org.example.decide;
//Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.
public class Task6 {

    private static class Student{
        private String name;
        private int age;
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(!(o instanceof Student)) return false;
            Student student = (Student) o;
            return this.name.equals(student.name) && this.age == student.age;
        }
    }

    public static void main(String[] args){
        Student st1 = new Student("abc", 11);
        Student st2 = new Student("abc", 11);
        Student st3 = null;
        System.out.println(st1.equals(st3));
    }
}
