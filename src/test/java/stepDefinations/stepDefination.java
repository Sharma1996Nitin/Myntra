package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class stepDefination {

    WebDriver driver;

    @Given("^User is on Myntra Landing Page$")
    public void myntra_Landing_Page() throws Throwable
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Actions a=new Actions(driver);
        driver.get("https://www.myntra.com/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector(".desktop-container .desktop-navLinks .desktop-navContent:nth-child(1)"));
        a.moveToElement(element).perform();
    }

    @When("^User login into Myntra Site with Mobile OTP$")
    public void user_login() throws Throwable
    {

    }

    @Then("^User login successfully into Home page$")
    public void home_page() throws Throwable
    {
        System.out.println("Working");



    }
}
