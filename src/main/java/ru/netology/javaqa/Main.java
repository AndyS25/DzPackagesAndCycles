package ru.netology.javaqa.services;

public class Main {
    public static void main(String[] args) {
        CalculatorVacationService service = new CalculatorVacationService();

        int countMonth = service.calculate(10_000, 3_000, 20_000);
        System.out.println("Количество месяцев отдыха в  году:  " + countMonth);
    }
}