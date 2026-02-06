package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.time.Duration;

public class ContactCreationTests extends TestBase{
  FirefoxDriver wd;

    @Test
  public void testContactCreation() {
    app.addNewContact();
    app.fillContactForm(new ContactData("Yulia", "Ve", "9(888)777-66-55", "prelest@gm.com"));
    app.submitContactCreation();
    app.returnHomePage();
  }

}
