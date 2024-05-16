package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    /* 3) Du ska testa att metoden playerSetup(Player player) i interfacet PlayerInteraction
      (implementationsklassen är SimplePlayerInteraction) sätter spelarens namn. Använd den
      privata metoden som du själv har skapat och som ger dig en instans av PlayerInteraction
      och skicka med det tänkta namnet på spelaren till Scannern. Kalla därefter på metoden
      .playerSetup() och verifiera därefter, med lämplig metod i Assertions-klassen, att
      player.getName() motsvarar värdet av det namn du har valt (namnet du skickade in till
      Scannern).
     */
    private PlayerInteraction testPlayerInteraction(String dataForScanner){

        PlayerInteraction playerInteraction = new SimplePlayerInteraction(new IOHandler(
                new Scanner(dataForScanner)));

        return playerInteraction;

    }

    private Player player;

    @BeforeEach
    public void init(){
        player = new Player();
    }

    @Test
    public void testingPlayerName(){
        testPlayerInteraction("A").setupPlayer(player);

        Assertions.assertEquals("A", player.getName());
    }

    /* 4) Testa att metoden updatePlayerHealth() i PlayerInteraction uppdaterar spelarens hälsa
    på korrekt sätt. Använd återigen den privata metoden för tillgång till instans av
    PlayerInteraction
     */
    @Test
    public void testingUpdatePlayerHealth(){
        testPlayerInteraction("A").updatePlayerHealth(player, 100);

        Assertions.assertEquals(100, player.getHp());
    }


}
