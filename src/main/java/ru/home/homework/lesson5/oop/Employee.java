package ru.home.homework.lesson5.oop;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phoneNumber;
    private long salary;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String fullName, String post, String email, String phoneNumber, long salary, int age) {
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
