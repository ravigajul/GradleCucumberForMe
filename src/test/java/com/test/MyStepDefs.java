package com.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefs {

    @Given("I navigate to bank site")
    public void i_navigate_to_bank_site() throws InterruptedException {
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://www.google.com");
        System.out.println("Navigated to bank site" + driver.getTitle());
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("Entered User Name and Password");
    }
    @Then("I log in to home page")
    public void iLogInToHomePage() {
        System.out.println("Logged into home page");
    }
}
