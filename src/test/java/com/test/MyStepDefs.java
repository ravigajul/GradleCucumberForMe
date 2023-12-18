package com.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class MyStepDefs {

    @Given("I navigate to bank site")
    public void i_navigate_to_bank_site() {
        System.out.println("Navigated to bank site");
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("Entered User Name and Password");
    }
    @Then("I loging to home page")
    public void i_loging_to_home_page() {
        System.out.println("Logged into home page");
    }
}
