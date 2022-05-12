package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.theNumberOfSquaresInAGivenRangeOfNumbers(200, 600);
        System.out.println("Количество квадратов в диапазоне " + count + ".");
    }
}
