package ru.home.homework.lesson5.oop;

import java.util.Scanner;

public class MainApp {
    public static Employee[] employeesArray;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        1. Создать класс "Сотрудник" с полями:
        ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод,
        который выводит информацию об объекте в
        консоль.
        4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
        30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.



        _________________________________________________________________________
        Усложнение:
        1. Пользователь сам вносит размер списка
        2. Пользователь сам вносит параметры
        3. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        */
        createEmployeesArray();
        createEmployee();
        checkAndPrintEmployeesArray();
    }

    public static void createEmployeesArray() {
        System.out.println("Введите размер списка работников");
        int size = scanner.nextInt();
        employeesArray = new Employee[size];
    }

    public static void createEmployee() {
        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println("Введите ФИО: ");
            String name = scanner.next();
            System.out.println("Введите Должность: ");
            String post = scanner.next();
            System.out.println("Введите email: ");
            String email = scanner.next();
            System.out.println("Введите номер телефона: ");
            String phone = String.valueOf(scanner.nextLong());
            System.out.println("Введите зарплату: ");
            long salary = scanner.nextLong();
            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();
            employeesArray[i] = new Employee(name, post, email, phone, salary, age);
        }
    }

    public static void checkAndPrintEmployeesArray() {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].printInfo();
            }
        }
    }
}
