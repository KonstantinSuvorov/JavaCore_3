package ru.geekbrains.core.lesson3;

/** 
 * Класс работника с фиксированной оплатой труда
 */
class Worker extends Human {
    private final double fixedMonthlyPayment;

    public Worker(String name, double fixedMonthlyPayment) {
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculateAverageSalary() {
        return fixedMonthlyPayment;
    }
}
