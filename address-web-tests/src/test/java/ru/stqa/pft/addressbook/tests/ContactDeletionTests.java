package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{


  @Test
  public void testContactDeletion() {
  app.getContactHelper().selectContact();
  app.getContactHelper().deleteContact();
  app.getNavigationHelper().returnHomePage();
    }
}
