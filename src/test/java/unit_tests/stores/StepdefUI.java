package unit_tests.stores;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.jvm.hotspot.utilities.Assert;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by slavkurochkin on 3/22/17.
 */
public class StepdefUI {

    WebDriver driver = new FirefoxDriver();

    @When("^user search for \"([^\"]*)\"$")
    public void user_search_for(String itemToSearch) throws Throwable {
        driver.findElement(By.xpath("//*[@id='global-search-input']")).clear();
        driver.findElement(By.xpath("//*[@id='global-search-input']")).sendKeys(itemToSearch);
        driver.findElement(By.xpath("//*[@id='global-search-form']/div/div[3]/button")).click();
    }

    @Then("^the result is displayed$")
    public void result_is_displayed() throws Throwable {
        assertEquals("USB-C", driver.findElement(By.xpath("//*[@id='searchProductResult']/div[1]/div[1]/div/div[2]/div[1]/a/h2/div/mark")).getText());
        driver.quit();
    }

    @Given("^user on home page of \"([^\"]*)\"$")
    public void user_on_home_page_of_storeName(String site) throws Throwable {
        Thread.sleep(3000);
        driver.navigate().to(site);
    }

    @Then("^the result should contain \"([^\"]*)\"$")
    public void the_result_should_contain_expectedResult(String expected) throws Throwable {
        assertThat(driver.findElement(By.xpath("//*[@id='searchProductResult']/div[1]/div[1]/div/div[2]/div[1]/a/h2/div/mark")).getText(), CoreMatchers.containsString(expected));
        driver.quit();
    }
}
