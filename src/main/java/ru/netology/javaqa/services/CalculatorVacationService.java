package ru.netology.javaqa.services;

public class CalculatorVacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // решаем как проводим месяц: работать или отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money - expenses + income;
            }
        }
        return count;
    }
}
