package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PlayerControllerTest {

    private ChromeDriver driver;

    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    /* 1) Verifiera att rätt antal players visas i listan (exempel: har du spelat två spel bör det finnas
         två players i listan och detta ska verifieras)
    */
    @Test
    public void testingDisplayRightAmountOfPlayers(){
        driver.get("http://localhost:8080/players");

        List<WebElement> elements = driver.findElements(By.tagName("li"));

        Assertions.assertEquals(2, elements.size());
    }

    /* 2) Verifiera att namnet på den första playern i listan visas på sidan (använd metoden
       isDisplayed() i klassen WebElement).

     */
    @Test
    public void testingDisplayFirstPlayerName(){
        driver.get("http://localhost:8080/players");

        WebElement elements = driver.findElement(By.className("player-name"));

        Assertions.assertTrue(elements.isDisplayed());

    }

    // 3) Testa att sidans titel överensstämmer med förväntat värde
    @Test
    public void testingDisplayPageTitle(){
        driver.get("http://localhost:8080/players");

        Assertions.assertEquals("Players List", driver.getTitle());

    }

    // 4) Testa att knappen har texten = Logga in
    @Test
    public void testinglogInButton(){
        driver.get("http://localhost:8080/players");

        WebElement element = driver.findElement(By.tagName("Button"));

        Assertions.assertEquals("Logga in", element.getText());

    }







}
