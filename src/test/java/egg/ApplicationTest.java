package egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void pepitoTesting(){
        WebDriverManager.chromedriver().setup();
        WebDriver miWebDrive = new ChromeDriver();

        miWebDrive.get("https://www.videorockola.com/proyectos-electronicos/luces-iluminacion/vumetro-activado-microfono/");

        WebElement elsidebar = miWebDrive.findElement(By.id("small-sidebar"));


        miWebDrive.get("https://www.selenium.dev/documentation/webdriver/waits/");

        WebElement mansoPython = miWebDrive.findElement(By.xpath("/html/body/div/div[1]/div/main/nav/ol/li[1]/a"));

        mansoPython.click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        miWebDrive.close();

    }


}


/*
 *  Ahora crea una prueba que:
 *    Abra el navegador en Chrome. 
 * ok
 *    Vaya a una URL de tu preferencia. 
 * ok
 *    Identifique un elemento por ID.
 * ok
 *    Vaya a otra URL.
 * ok
 *    Identifique un elemento por LinkText.
 * casi vio
 *    Haga click en ese elemento.
 * ok
 *    Cierre el navegador.
 * ok
 */