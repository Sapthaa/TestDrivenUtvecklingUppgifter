package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    /* 5) Skapa ett test av attack()-metoden i Actor-klassen. Låt en implementation-klass av Actor
    attackera en annan implementations-klass av Actor. Verifiera att den attackerades HP
    minskar på ett sätt som överensstämmer med vad du förväntar dig. Instansera båda
    implementationerna med värden (ej de tomma konstruktorerna).
    */
    @Test
    public void testingAttackMethodWithTwoActorClasses(){
        Player player = new Player("A", 10,10);
        Guard guard = new Guard();

        player.attack(guard);

        Assertions.assertEquals(10, guard.getHp());
    }

}
