package ru.geekbrains.core.lesson3;

public class Main {
    public static void main(String[] args) {
        Human[] workers = new Human[5];
        workers[0] = new Freelancer("Шершнев", 255);
        workers[1] = new Freelancer("Судаков", 345);
        workers[2] = new Worker("Петров", 33000);
        workers[3] = new Worker("Суровцев", 47000);
        workers[4] = new Worker("Судакова", 38000);

        // Создание объекта класса WorkersArray
        WorkersArray workersArray = new WorkersArray(workers);

        // Сортировка массива работников по имени
        workersArray.sortByName();

        // Вывод информации о работниках
        System.out.println("\nСортировка по фамилии:\n");
        workersArray.printWorkersInfo();

        // Сортировка массива работников по заработной плате
        workersArray.sortByAverageSalary();

        // Вывод информации о работниках
        System.out.println("\nСортировка по средней зарплате:\n");
        workersArray.printWorkersInfo();
    }
}
