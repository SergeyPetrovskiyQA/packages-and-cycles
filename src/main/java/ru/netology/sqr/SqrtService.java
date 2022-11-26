package ru.netology.sqr;

public class SqrtService {
    public int CalsSqrt(int x, int y) {
        int counter = 0;
        for (int i = 10; i < 100; i++)
            if (i * i >= x && i * i <= y) {
                counter++;
            }
        return counter;
    }
}
