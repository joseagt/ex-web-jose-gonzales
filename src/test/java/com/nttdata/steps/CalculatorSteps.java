package com.nttdata.steps;

import com.nttdata.page.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CalculatorSteps {

    private WebDriver driver;

    //constructor
    public CalculatorSteps(WebDriver driver){
        this.driver = driver;
    }


    public void typeFirstNumber(String firstNumber){
        WebElement userInputElement = driver.findElement(CalculatorPage.firstNumberInput);
        userInputElement.sendKeys(firstNumber);
    }

    public void typeSecondNumber(String secondNumber){
        WebElement userInputElement = driver.findElement(CalculatorPage.secondNumberInput);
        userInputElement.sendKeys(secondNumber);
    }

    public void selectOperation(String operation){
        Select operations = new Select(driver.findElement(CalculatorPage.operationSelect));
        operations.selectByVisibleText(operation);

    }
    public void validateAnswer(String answer){
        WebElement userInputElement = driver.findElement(CalculatorPage.answerInput);
         String text =userInputElement.getText();
        Assertions.assertEquals(answer,text);
    }

    public void calculate(){
        this.driver.findElement(CalculatorPage.calculatorButton).click();
    }

}
