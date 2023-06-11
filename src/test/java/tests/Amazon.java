package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.AmazonHomePage;
import utilities.Driver;

public class Amazon {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    @Test
    public void search(){

        Faker faker = new Faker();
        String testData = faker.lorem().word();
        Driver.getDriver().get("https://amazon.com");
        amazonHomePage.searchField.sendKeys("tesla car" + Keys.ENTER);
        System.out.println("Test");

    }

    @Test
    public void amazonImage(){
        Driver.getDriver().get("https://amazon.com");
        System.out.println("Checking some image");

    }
}
