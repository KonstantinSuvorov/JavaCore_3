## Урок 3. Классы и объекты

- Построить три класса ([базовый](src/main/java/ru/geekbrains/core/lesson3/Human.java) и 2 потомка), описывающих некоторых [работников с почасовой оплатой](src/main/java/ru/geekbrains/core/lesson3/Freelancer.java) (один из потомков) и [фиксированной оплатой](src/main/java/ru/geekbrains/core/lesson3/Worker.java) (второй потомок).
  - Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
  ```java
   public abstract double calculateAverageSalary();
  ```
  Для «повременщиков» формула для расчета такова: 
    - «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка», 
  
  для работников с фиксированной оплатой: 
    - «среднемесячная заработная плата = фиксированная месячная оплата».
  
  ```java
    @Override
    public double calculateAverageSalary() {
        return 20.8 * 8 * hourlyRate;
    }
  
    @Override
    public double calculateAverageSalary() {
        return fixedMonthlyPayment;
    }
  ```
  - Создать на базе абстрактного класса массив сотрудников и заполнить его.
  - ** Реализовать интерфейсы для возможности сортировки массива (обратите ваше внимание на интерфейсы Comparator, Comparable)
  - ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
  ```java
  class WorkersArray {
      private Worker[] workers;
  
      public WorkersArray(Worker[] workers) {
          this.workers = workers;
      }
  
      // Метод для сортировки массива работников по фамилии
      public void sortByName() {
          Arrays.sort(workers, Comparator.comparing(Worker::getName));
      }
  
      // Метод для сортировки массива работников по заработной плате
      public void sortByAverageSalary() {
          Arrays.sort(workers, Comparator.comparing(Worker::calculateAverageSalary));
      }
  
      // Метод для вывода информации о работниках
      public void printWorkersInfo() {
          for (Worker worker : workers) {
              System.out.println("Фамилия: " + worker.getName() + ", Средняя зарплата: " + worker.calculateAverageSalary());
          }
      }
  }
  ```

