package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class IOHandlerTest {

    /* 2)Metoden hasNextInt() i en java.util.Scanner kommer att returnera true om du instanserar
        klassen med en siffra (fast i en sträng, omgiven av citattecken). För att kunna skapa en
        instans av klassen IOHandler behöver du skicka med en instans av java.util.Scanner.
        Skapa en instans av IOHandler med en Scanner, just instanserad med en siffra. Använd
        din privata metod du själv har skapat och som ger tillbaka en IOHandler-instans. Testa
        sedan metoden hasNextInt() i IOHandler på passande sätt. Undersök klassen IOHandler
        för att förstå hur detta hänger ihop.
     */

    private IOHandler iOHandlerScanner(String dataForScanner){

        return new IOHandler(new Scanner(dataForScanner));
    }

    @Test
    public void testingOfIOHandler(){

        boolean isItTrue = iOHandlerScanner("100").hasNextInt();

        Assertions.assertTrue(isItTrue);
    }
}
