package Base_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Base_class {

    public static WebDriver driver;

    public void browser_launch(String Url) {

        driver.get(Url);
        driver.getTitle();

    }

    public void location(WebElement loc) {

        loc.click();

    }

//select

    public void selectbyindex(WebElement element, int ls) {

        Select select = new Select(element);

        select.selectByIndex(ls);

    }

    public void hotels(WebElement hot) {

        hot.click();
    }

    public void selectbyvalue(WebElement element, String hs) {

        Select h = new Select(element);

        h.selectByValue(hs);
    }

    public void roomtype(WebElement rt) {

        rt.click();
    }

    public void numberofrooms(WebElement nor) {

        nor.click();
    }

    public void checkindate(WebElement chkindate) {
        chkindate.click();
    }

    public void checkoutdate(WebElement chkoutdate) {
        chkoutdate.click();
    }

    public void adultperroom(WebElement adultroom) {
        adultroom.click();
    }

    public void childperroom(WebElement childroom) {

        childroom.click();
    }

    public void searchbtn(WebElement search) {

        search.click();

    }

    public void Continuebtn(WebElement element) {

        element.click();

    }

    public void scrollintoview(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //scroll into view
        js.executeScript("arguments[0].scrollIntoView()", element);

    }




}




