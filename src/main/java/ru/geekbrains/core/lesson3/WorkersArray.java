package ru.geekbrains.core.lesson3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс, содержащий массив сотрудников
 */
class WorkersArray {
    private final Worker[] workers;

    public WorkersArray(Worker[] workers) {
        this.workers = workers;
    }

    /**
     * Метод для сортировки массива работников по фамилии
     */
    public void sortByName() {
        Arrays.sort(workers, Comparator.comparing(Worker::getName));
    }

    /**
     * Метод для сортировки массива работников по заработной плате
     */
    public void sortByAverageSalary() {
        Arrays.sort(workers, Comparator.comparing(Worker::calculateAverageSalary));
    }

    /**
     * Метод для вывода информации о работниках
     */
    public void printWorkersInfo() {
        for (Worker worker : workers) {
            System.out.println("Фамилия: " + worker.getName() + ", Средняя зарплата: " + worker.calculateAverageSalary());
        }
    }
}
