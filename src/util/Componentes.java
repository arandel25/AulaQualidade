package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Componentes {

    private WebDriver driver;
    private Select combo;

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

    public void testeRadioButton(int campo) {
        driver.findElement(By.id("elementosForm:sexo:" + campo)).click();
    }

    public void validaRadioButton(int campo) {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:" + campo)).isSelected());
    }

    public void testeCheckBox(int campo) {
        driver.findElement(By.id("elementosForm:comidaFavorita:" + campo)).click();
    }

    public void validaCheckBox(int campo) {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:" + campo)).isSelected());
    }

    public void selecionarValorCombobox() {
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByIndex(5);
    }

    public void validaValorComboBox() {
        Assert.assertEquals("Especializacao", combo.getFirstSelectedOption().getText());
    }

    public void selecionaTodosElementosComboBox() {
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
    }

    public void validaQuatidadeOpcoesCombo() {
        Assert.assertEquals(8, combo.getOptions().size());
    }

    public void selecionaMestrado() {
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByValue("mestrado");
    }

    public void validaMestradoSelecionado() {
        List<WebElement> opcoes = combo.getOptions();
        String encontrou = "";
        for (WebElement opcao : opcoes) {
            opcao.getText().equals("Mestrado");
            encontrou = "Mestrado";
            break;
        }
        Assert.assertEquals(encontrou, combo.getFirstSelectedOption().getText());
    }
}