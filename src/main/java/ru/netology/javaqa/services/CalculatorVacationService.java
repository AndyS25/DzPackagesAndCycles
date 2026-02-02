package ru.netology.javaqa.services;

public class CalculatorVacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            int balans = money - expenses; //остаток накоплений после обязательных месячных трат
            if (money >= threshold) { // решаем как проводим месяц: работать или отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = balans / 3;
            } else {
                money = balans + income;
            }
        }
        return count;
    }
}
