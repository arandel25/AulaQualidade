package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Componentes {

    private WebDriver driver;

    public void inicializa() {
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/resources/componentes.html");
    }

    public void fechaNavegador() {
        driver.quit();
    }

    public void navegadorChrome() {
        Assert.assertTrue(driver.toString().contains("Chrome"));
    }

    public void testeTextField() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

    public void validaTextField() {
        Assert.assertEquals("Batatinha", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testeTextArea() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Batatinha\nBatatinha2");
    }

    public void validaTextArea() {
        Assert.assertEquals("Batatinha\nBatatinha2", driver.findElement(By.id("elementosForm:sugestoes"))
                .getAttribute("value"));
    }
}
