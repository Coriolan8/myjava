package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
  FirefoxDriver wd;

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goHomePage();
    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Yulia", "Ve", "9(888)777-66-55", "prelest@gm.com", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goHomePage();
  }

}
