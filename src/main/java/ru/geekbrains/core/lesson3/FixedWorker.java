package ru.geekbrains.core.lesson3;

/** 
 * Класс работника с фиксированной оплатой труда
 */
class FixedWorker extends Worker {
    private final double fixedMonthlyPayment;

    public FixedWorker(String name, double fixedMonthlyPayment) {
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculateAverageSalary() {
        return fixedMonthlyPayment;
    }
}
