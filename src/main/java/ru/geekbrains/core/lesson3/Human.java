package ru.geekbrains.core.lesson3;

abstract class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод расчёта среднемесячной заработной платы
     */
    public abstract double calculateAverageSalary();

    public String getName() {
        return name;
    }
}


