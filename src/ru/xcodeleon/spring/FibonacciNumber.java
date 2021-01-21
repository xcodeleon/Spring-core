package ru.xcodeleon.spring;

import javax.sound.midi.Soundbank;


//Вычисление числа Фибоначчи первых 10 чисел
public class FibonacciNumber {
    int maxNumber = 10;
    int previousNumber = 0;
    int nextNumber = 1;

    @Override
    public String toString() {

        for (int i = 1; i <= maxNumber; ++i) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

            System.out.print(previousNumber + " ");

        }
        return "Fibonacci series of " + maxNumber + " numbers";
    }
}
