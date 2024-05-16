package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class JavaUtilScannerTest {

    /* 1)java.util.Scanner, som används i detta spel (precis som i era elevspel) kan instanseras
        med en sträng. Strängen kan motsvara det användaren matar in via System.in. Gör detta
        och testa sedan, med lämplig metod i Assertions-klassen, att metoden nextLine() i
        Scannern ger tillbaka denna data.
     */


    @Test
    public void testingOfScannerWithString(){
        Scanner scanner = new Scanner("Hello world");
        String stringTest = scanner.nextLine();

        Assertions.assertEquals("Hello world", stringTest);

    }


}
