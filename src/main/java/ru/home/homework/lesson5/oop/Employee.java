package ru.home.homework.lesson5.oop;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Employee name : " + fullName);
        System.out.println("Employee post : " + post);
        System.out.println("Employee email : " + email);
        System.out.println("Employee phoneNumber : " + phoneNumber);
        System.out.println("Employee salary : " + salary);
        System.out.println("Employee age : " + age);
        System.out.println("===============================");
    }

}
