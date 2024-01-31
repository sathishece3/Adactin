package Stepdefinition;

import Adactin_Pom.Pom_class;
import Base_class.Base_class;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;


public class Stepfile extends Base_class {

    Pom_class pomClass = new Pom_class();

    @Given("user launch the url")
    public void user_launch_the_url() {


        browser_launch("https://adactinhotelapp.com/");
        driver.manage().window().maximize();

    }

    @When("user enter the user name")
    public void user_enter_the_user_name() {

        driver.findElement(pomClass.user_name).sendKeys("sathishece3");

    }

    @Then("user enter the password")
    public void user_enter_the_password() {
        driver.findElement(pomClass.password).sendKeys("Password1");

    }

    @Then("user click the login button")
    public void user_click_the_login_button() {
        driver.findElement(pomClass.login_btn).click();

    }

    @Given("user select the location")
    public void user_select_the_location() {

        driver.findElement(pomClass.location).click();
        selectbyindex(driver.findElement(pomClass.location), 3);
    }

    @When("user click and select the relevent hotel")
    public void user_click_and_select_the_relevent_hotel() {

        driver.findElement(pomClass.hotel).click();
        selectbyvalue(driver.findElement(pomClass.hotel), "Hotel Sunshine");

    }

    @Then("user click and select the room type")
    public void user_click_and_select_the_room_type() {
        driver.findElement(pomClass.roomtype).click();
        selectbyindex(driver.findElement(pomClass.roomtype), 3);

    }

    @Then("user click and select the no of rooms required")
    public void user_click_and_select_the_no_of_rooms_required() {
        driver.findElement(pomClass.noofrooms).click();
        selectbyindex(driver.findElement(pomClass.noofrooms), 2);

    }

    @Then("user click and search and select the required checkin date")
    public void user_click_and_search_and_select_the_required_checkin_date() {
        driver.findElement(pomClass.check_in_date).clear();
        driver.findElement(pomClass.check_in_date).sendKeys("25/01/2025");

    }

    @Then("user click and search and select the required checkout date")
    public void user_click_and_search_and_select_the_required_checkout_date() {
        driver.findElement(pomClass.check_out_date).clear();
        driver.findElement(pomClass.check_out_date).sendKeys("28/01/2025");

    }

    @Then("user click and select the no of required Adult rooms")
    public void user_click_and_select_the_no_of_required_adult_rooms() {
        driver.findElement(pomClass.adultperroom).click();
        selectbyindex(driver.findElement(pomClass.adultperroom), 2);

    }

    @Then("user click and select the no of required child rooms")
    public void user_click_and_select_the_no_of_required_child_rooms() {
        driver.findElement(pomClass.childroom).click();
        selectbyindex(driver.findElement(pomClass.childroom), 3);

    }

    @Then("user click the search option button")
    public void user_click_the_search_option_button() {

        driver.findElement(pomClass.search).click();

    }

    @Given("user click and select the Hotel")
    public void user_click_and_select_the_hotel() {

        driver.findElement(pomClass.selecthotel).click();
    }

    @When("user click the continue button")
    public void user_click_the_continue_button() {

        driver.findElement(pomClass.clkcontinue).click();
    }

    @Given("user scroll down the page")
    public void user_scroll_down_the_page() {

        scrollintoview(driver.findElement(pomClass.cvv_number));

    }
    @Given("user enter the first name")
    public void user_enter_the_first_name() {

        driver.findElement(pomClass.firstname).sendKeys("Sathish");

    }

    @When("user enter the last name")
    public void user_enter_the_last_name() {
        driver.findElement(pomClass.lastname).sendKeys("kumar.V");

    }

    @When("user enter the billing address")
    public void user_enter_the_billing_address() {

        driver.findElement(pomClass.billingaddress).sendKeys("No1 MTH Road, Padi, chennai");

    }

    @When("user enter the creditcard no")
    public void user_enter_the_creditcard_no() {

        driver.findElement(pomClass.creditcardno).sendKeys("9999 8888 7777 6666");

    }

    @When("user click and select the credit card type")
    public void user_click_and_select_the_credit_card_type() {

        driver.findElement(pomClass.creditcardtype).click();
        selectbyindex(driver.findElement(pomClass.creditcardtype), 2 );

    }

    @When("user click and select the expiry date")
    public void user_click_and_select_the_expiry_date() {

        driver.findElement(pomClass.expiry_month).click();
        selectbyindex(driver.findElement(pomClass.expiry_month), 8);

    }

    @When("user click and select the expiry year")
    public void user_click_and_select_the_expiry_year() {

        driver.findElement(pomClass.expiry_year).click();
        selectbyvalue(driver.findElement(pomClass.expiry_year),"2025");

    }

    @When("user enter the cvv no")
    public void user_enter_the_cvv_no() {

        driver.findElement(pomClass.cvv_number).sendKeys("3333");

    }

    @When("user click the book now button")
    public void user_click_the_book_now_button() {

        driver.findElement(pomClass.booknow).click();

    }

    @Given("user scroll the page down")
    public void user_scroll_the_page_down() {

        scrollintoview(driver.findElement(pomClass.search_option));


    }


//    @When("user click the My Itinerary button")
//    public void user_click_the_my_itinerary_button() {
//
//      scrollintoview(driver.findElement(pomClass.About_adactin));
//      driver.findElement(pomClass.About_adactin).click();






}
