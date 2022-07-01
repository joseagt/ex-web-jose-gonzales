package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CalculatorSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorStepsDef {

    private WebDriver driver;
    private Scenario scenario;
    private CalculatorSteps calculatorSteps;


    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "D:\\bootcamp-NNTTDATA\\app\\ex-web-jose-gonzales\\drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Dado("que me encuentro en la página de basic Calculator")
    public void que_me_encuentro_en_la_página_de_basic_calculator() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
        calculatorSteps = new CalculatorSteps(driver);
    }
    @Cuando("ingrese los numeros primer numero: {string} y segundo numero: {string}")
    public void ingrese_los_numeros_primer_numero_y_segundo_numero(String string, String string2) {
        calculatorSteps.typeFirstNumber(string);
        calculatorSteps.typeSecondNumber(string2);

    }
    @Y("selecciona la operacion: {string}")
    public void selecciona_la_operacion(String string) {
        calculatorSteps.selectOperation(string);
    }
    @Y("dar click en el boton {string}")
    public void dar_click_en_el_boton(String string) {
        calculatorSteps.calculate();
    }
    @Entonces("valido que debería aparecer el monto calculado {string}")
    public void valido_que_debería_aparecer_el_monto_calculado(String string) {
        calculatorSteps.validateAnswer(string);
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

}
