package unit_tests.stores;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

/**
 * Created by slavkurochkin on 3/22/17.
 */
public class Stepdef {

        Stores wallMart;
        Stores bestBuy;
        private String productFromBestBuy;

        @Given("^WallMart is (\\d+) miles from BestBuy$")
        public void WallMart_is_miles_from_BestBuy(int distance) throws Throwable {
            wallMart = new Stores();
            bestBuy = new Stores();
            wallMart.setLocation(distance);
            bestBuy.setLocation(0);
        }

        @When("^BestBuy have sales on \"([^\"]*)\"$")
        public void BestBuy_have_sales_on(String product) throws Throwable {
            bestBuy.sell(product);
            productFromBestBuy = product;

        }

        @Then("^WallMart should sell it with discount$")
        public void WallMart_should_sell_it_with_discount() throws Throwable {
            assertEquals(asList(productFromBestBuy), wallMart.getProduct());
        }
}

