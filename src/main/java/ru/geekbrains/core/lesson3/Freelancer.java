package ru.geekbrains.core.lesson3;

/**
 * Класс работника с почасовой оплатой труда
 */
class Freelancer extends Human {
    private final double hourlyRate;

    public Freelancer(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAverageSalary() {
        return 20.8 * 8 * hourlyRate;
    }
}

