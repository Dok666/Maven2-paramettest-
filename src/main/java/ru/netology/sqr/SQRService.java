package ru.netology.sqr;


public class SQRService {

    public int theNumberOfSquaresInAGivenRangeOfNumbers(int rangeStart , int endOfRange) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= rangeStart && square <= endOfRange) {
                count++;
            }
        }
        return count;
    }
}