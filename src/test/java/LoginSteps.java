import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {


    WebDriver driver = BaseTest.getDriver();


    @Given("I am valid user on start of i.ua page")
    public void iAmValidUserOnStartOfIUaPage() {

        driver.get("https://passport.i.ua/login/");
    }

    @When("I try to login with valid credentials")
    public void iTryToLoginWithValidCredentials() {
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hillel.summer2021@i.ua");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Summer202!");
        driver.findElement(By.xpath("//input[@value='Войти']")).click();
    }



    @Then("I've logged in successfully")
    public void iVeLoggedInSuccessfully() {
        System.out.println();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@title='выйти']")).isDisplayed();


    }


    @When("I try to login with {string} and {string}")
    public void iTryToLoginWithUsernameUsernameAndPasswordPassword(String username, String password) {

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Войти']")).click();
    }

    @When("I try to login with")
    public void iTryToLoginWith(DataTable table) {

        ;

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys(table.asList().get(0));
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(table.asList().get(1));
        driver.findElement(By.xpath("//input[@value='Войти']")).click();
    }
}
