package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    @Parameterized.Parameters

    @Test
    public void shouldSumPositive() {
        Calculator calculator = new Calculator(); // создали экземпляр класса
        int firstNumber = 1;
        int secondNumber = 9;
        int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
        int expected = 10;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }
    @Test
    public void shouldSumPositiveAndZero() {
        Calculator calculator = new Calculator(); // создали экземпляр класса
        int firstNumber = 1;
        int secondNumber = 0;
        int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
        int expected = 1;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }
}

