package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Ruslan", 123);
        Student s2 = new Student("Masha", 1452);
        System.out.println(s1.getName());
        System.out.println(s1.getRegNo());
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s2.toString());
    }
}
