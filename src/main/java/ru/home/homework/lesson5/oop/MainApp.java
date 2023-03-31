package ru.home.homework.lesson5.oop;

public class MainApp {
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
        */

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Semen Semenovich", "Director", "semen@sobaka.ru", "+792312312", 150_000, 50);
        employeesArray[1] = new Employee("Ivan Semenovich", "Art Director", "ivan@sobaka.ru", "+792312313", 130_000, 49);
        employeesArray[2] = new Employee("Dmitriy Semenovich", "Marketolog", "dmitriy@sobaka.ru", "+792312314", 100_000, 29);
        employeesArray[3] = new Employee("Petr Semenovich", "Seller", "petr@sobaka.ru", "+792312315", 70_000, 25);
        employeesArray[4] = new Employee("Vladimir Semenovich", "Uborshik", "vladimir@sobaka.ru", "+792312316", 50_000, 60);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].printInfo();
            }
        }
    }
}
