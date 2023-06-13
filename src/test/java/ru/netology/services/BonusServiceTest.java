package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")

    public void Vacation(int income, int expenses, int threshold, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }

}