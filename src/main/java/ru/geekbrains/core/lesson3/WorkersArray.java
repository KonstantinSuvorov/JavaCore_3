package ru.geekbrains.core.lesson3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс, содержащий массив сотрудников
 */
class WorkersArray {
    private final Human[] workers;

    public WorkersArray(Human[] workers) {
        this.workers = workers;
    }

    /**
     * Метод для сортировки массива работников по фамилии
     */
    public void sortByName() {
        Arrays.sort(workers, Comparator.comparing(Human::getName));
    }

    /**
     * Метод для сортировки массива работников по заработной плате
     */
    public void sortByAverageSalary() {
        Arrays.sort(workers, Comparator.comparing(Human::calculateAverageSalary));
    }

    /**
     * Метод для вывода информации о работниках
     */
    public void printWorkersInfo() {
        for (Human worker : workers) {
            System.out.println("Фамилия: " + worker.getName() + ", Средняя зарплата: " + worker.calculateAverageSalary());
        }
    }
}
