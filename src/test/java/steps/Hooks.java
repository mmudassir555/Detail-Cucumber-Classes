package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

import java.io.FileNotFoundException;

public class Hooks extends CommonMethods {


    @Before
    public void start() throws FileNotFoundException {
        openBrowserLunchApplication();
    }


    @After
    public void end(){
        closeBrowser();
    }
}
