import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailStepsDefinition {

    WebDriver driver = BaseTest.getDriver();
    @And("I go to mail page")
    public void iGoToMailPage() {

        driver.findElement(By.xpath("//*[@title='Почта']")).click();
        System.out.println("");
    }

    @Then("Able to get messages")
    public void ableToGetMessages() {

        driver.findElement(By.xpath("//*[@class='make_message']")).isDisplayed();

    }
}
