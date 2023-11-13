package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.CombinableMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.FileNotFoundException;
import java.time.Duration;

public class LoginSteps extends CommonMethods {

    // public WebDriver driver; (This driver coming from CommonMethod Class)

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException, FileNotFoundException {
      //  driver = new ChromeDriver();
      //  driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
      //  Thread.sleep(2000);
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      // openBrowserLunchApplication method coming form CommonMethod that have in utils package.
        openBrowserLunchApplication();
    }

    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {

        // UserName Field
                //{ Find Element Scenario
                    //object of the login page class to access all the web elements
                    // LoginPage lp = new LoginPage();
                    //"loginPage" is an object "lp" is a variable and "LoginPage()" is a method,
                    // that come from LoginPage Class who have in Pages Package.
                    // then comment the code of "WebElement usernameTextField = driver.findElement(By.xpath("//input[@id='txtUsername']"));"
                    //WebElement usernameTextField = driver.findElement(By.xpath("//input[@id='txtUsername']"));
                //}

                //{ Send Text Data Scenario
                   // usernameTextField.sendKeys("admin");
                   // sendText Method come from CommonMethod Class, usernameTextField is a variable,
                   // "ConfigReader" come from CommonMethod Class, "getPropertyValue" Come from ConfigReader Class
                //}
                    //{
                        sendText(loginPage.usernameTextField, ConfigReader.getPropertyValue("username"));
                        // In this line
                        // "sendText" come from CommonMethod,
                        // "loginPage" Method come from PageInitializer
                        // Element "usernameTextField" come from Page Object Class
                        // "ConfigReader" come form Config.properties Class
                        // "getPropertyValue" Config.properties Class
                        // Data "username" come from properties files
                    //}
                //}

        // Password Field
                //{ Find Element Scenario
                    //Comment the Find xpath line data come form login page
                    //WebElement passwordField = driver.findElement(By.xpath("//input[@id='txtPassword']"));
                //}

            //{ Send Text Data Scenario
                //passwordField.sendKeys("Hum@nhrm123");
                // sendText Method come from CommonMethod Class, usernameTextField is a variable,
                // "ConfigReader" come from CommonMethod Class, "getPropertyValue" Come from ConfigReader Class

                    //{
                        sendText(loginPage.passwordField, ConfigReader.getPropertyValue("password"));
                        // In this line
                        // "sendText" come from CommonMethod,
                        // "loginPage" Method come from PageInitializer
                        // Element "usernameTextField" come from Page Object Class
                        // "ConfigReader" come form Config.properties Class
                        // "getPropertyValue" Config.properties Class
                        // Data "username" come from properties files
                    //}
            //}
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        //{
            //LoginPage lp = new LoginPage();
            //Comment the Find xpath line data come form login page
            //WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        //}

        //{
            // loginBtn.click();
            //"click Method" come from CommonMethod Class and "loginBtn" is a variable
                //{
                    click(loginPage.loginBtn);
                        // "click" come from CommonMethod Class
                        // "loginpage" Method come from PageInitializer Class
                        // "loginBtn" come from Loginpage Class
                //}
        //}
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("Admin User Enter Successfully");
    }

}
