package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatorVacationServiceTest {
    @ParameterizedTest
   /* @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    */
    @CsvFileSource(files = "src/test/resources/countMonthVacation.csv")
    void testCalculateCountMonth(int expected, int income, int expenses, int threshold) {
        CalculatorVacationService service = new CalculatorVacationService();

        // подготавливаем данные:
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        // int expected = 3; //ожидаемое значение

        // вызываем целевой метод:
        int count = service.calculate(income, expenses, threshold); //считаем фактический результат
        System.out.println("Количество месяцев отдыха в году: " + count);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, count);
    }
}
