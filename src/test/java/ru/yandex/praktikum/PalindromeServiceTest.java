package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.PalindromeService;




@RunWith(Parameterized.class)
public class PalindromeServiceTest {

    private final String checkedText;
    private final boolean expected;

    public PalindromeServiceTest (String checkedText, boolean expected){
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"anna", true},
                {"anka", true},
                {"q", true},
        };
    }

    @Test
    public void shouldCheckPalindrome(){
        PalindromeService palindromeService = new PalindromeService ();
        boolean actual = palindromeService.isPalindrome(checkedText);
        assertEquals(actual, expected);
    }
}