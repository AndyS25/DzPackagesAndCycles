package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatorVacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/countMonthVacation.csv")
    void testCalculateCountMonth(int expected, int income, int expenses, int threshold) {
        CalculatorVacationService service = new CalculatorVacationService();

        // вызываем целевой метод:
        int count = service.calculate(income, expenses, threshold); //считаем фактический результат

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, count);
    }
}
