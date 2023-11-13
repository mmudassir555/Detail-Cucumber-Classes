package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class EmployeeSearchSteps extends CommonMethods {

    // public WebDriver driver; (This driver coming from CommonMethod Class)

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       // WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimOption.click();
       //("click Method" come from CommonMethod Class) & ("pimOption" is a variable)
            //{
                click(dashboardPage.pimButton);
                // "click" Come from CommonMethod Class
                // "dashboardPage" come from PageInitializer Class
                // "pimButton" come from EmployeeSearchPage Class
            //}
    }
    @When("user clicks on Employee List option")
    public void user_clicks_on_employee_list_option() {
       // WebElement employeeListOption = driver.findElement(By.id(0"menu_pim_viewEmployeeList"));
       // employeeListOption.click();
       // ("click Method" come from CommonMethod Class) & ("employeeListOption" is a variable)
            //{
                click(dashboardPage.empListButton);
                // "click" Come from CommonMethod Class
                // "dashboardPage" come from PageInitializer Class
                // "empListButton" come from EmployeeSearchPage Class
            //}
    }
    @When("user enters employee id")
    public void user_enters_employee_id() {
        //WebElement enterEmpID = driver.findElement(By.id("empsearch_id"));
        //enterEmpID.sendKeys("B178900225");
        // ("sendText Method" come from CommonMethod Class) & ("enterEmpID" is a variable)
        // ("ConfigReader" come from CommonMethod Class) & ("getPropertyValue" Come from ConfigReader Class)

            //{
                sendText(employeeSearchPage.empSearchIdField, ("88515A"));
                // "click" Come from CommonMethod Class
                // "employeeSearchPage" come from PageInitializer Class
                // "empSearchIdField" come from EmployeeSearchPage Class
            //}

    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        //searchBtn.click();
        // ("click Method" come from CommonMethod Class) & ("searchBtn" is a variable)

            //{
                click(employeeSearchPage.searchBtn);
                // "click" Come from CommonMethod Class
                // "employeeSearchPage" come from PageInitializer Class
                // "searchBtn" come from EmployeeSearchPage Class
            //}
    }
    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        System.out.println("You Can see Employee Details");
    }

    @When("user enters employee name")
    public void user_enters_employee_name() throws InterruptedException {
        //WebElement searchEmpName = driver.findElement(By.id("empsearch_employee_name_empName"));
        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // searchEmpName.sendKeys("Kenan Jones");
        // ("sendText Method" come from CommonMethod Class) & ("searchEmpName" is a variable)
        // ("ConfigReader" come from CommonMethod Class) & ("getPropertyValue" Come from ConfigReader Class)

            //{
                sendText(employeeSearchPage.empSearchNameField, ("Kenan Jones"));
                // "click" Come from CommonMethod Class
                // "employeeSearchPage" come from PageInitializer Class
                // "empSearchIdField" come from EmployeeSearchPage Class
            //}
    }

}
