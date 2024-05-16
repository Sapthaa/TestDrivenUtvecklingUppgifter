package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameUtilTest {

    /* 6) Testa metoden toLowerCaseButFirstLetterCapitalized() i klassen GameUtil. Du ska testa
      att skicka in null till denna metod. Verifiera att ett GamingException kastas med
      passande metod i Assertions-biblioteket.
    */
    @Test
    public void testingGameUtilMethodToLowerCase(){
        GameUtil gameUtil = new GameUtil();

        Assertions.assertThrows(GameException.class,
                ()-> gameUtil.toLowerCaseButFirstLetterCapitalized(null));

    }



}
