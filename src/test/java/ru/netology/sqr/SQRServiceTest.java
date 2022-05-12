package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testmvn.csv"})
    public void test(int rangeStart, int endOfRange, int expected) {
        SQRService service = new SQRService();

        int actual = service.theNumberOfSquaresInAGivenRangeOfNumbers(rangeStart, endOfRange);

        Assertions.assertEquals(expected, actual);
    }
}
