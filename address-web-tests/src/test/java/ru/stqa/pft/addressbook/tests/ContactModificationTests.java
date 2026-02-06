package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {


    @Test
    public void testContactModification() {
      app.getNavigationHelper().goHomePage();
      app.getContactHelper().selectContact();
      app.getContactHelper().startContactEdit();
      app.getContactHelper().fillContactForm(new ContactData("Yulia", "Very", "9(888)777-66-55", "prelest@gm.com"));
      app.getContactHelper().submitContactEdit();
      app.getNavigationHelper().goHomePage();
    }
}
