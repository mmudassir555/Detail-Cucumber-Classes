package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
      // WebElement addEmployeebtn = driver.findElement(By.id("menu_pim_addEmployee"));

        //{
            click(dashboardPage.addEmployeeButton);
            // "click" Come from CommonMethod Class
            // "dashboardPage" come from PageInitializer Class
            // "empListButton" come from EmployeeSearchPage Class
        //}

    }
    @When("user enters firstName middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        //WebElement fristName = driver.findElement(By.id("firstName"));
        //WebElement middleName = driver.findElement(By.id("middleName"));
        //WebElement lastName = driver.findElement(By.id("lastName"));
         //{
                sendText(addEmployeePage.firstName, "Muhammd");
                sendText(addEmployeePage.middleName, "Mudassir");
                sendText(addEmployeePage.lastName, "Hussain");
                // "sendText" Come from CommonMethod Class
                // "addEmployeePage" come from PageInitializer Class
                // "firstName" come from Addemployeepage Class
                // "lastName" type derictlly
        //}
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //WebElement saveBtn = driver.findElement(By.id("btnSave"));
        click(addEmployeePage.btnSave);
        // "click" Come from CommonMethod Class
        // "addEmployeePage" come from addEmployeePage Class
        // "btnSave" come from addEmployeePage

    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Admin Add User Employee Detail Successfully");
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
      closeBrowser();
    }

    //2nd Method to adding Employee Details

    @When("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String firstN, String minddleN, String lastN) {
        WebElement fristName = driver.findElement(By.id("firstName"));
        WebElement middleName = driver.findElement(By.id("middleName"));
        WebElement lastName = driver.findElement(By.id("lastName"));

        sendText(fristName, firstN);
        sendText(middleName, minddleN);
        sendText(lastName, lastN);
    }

}
