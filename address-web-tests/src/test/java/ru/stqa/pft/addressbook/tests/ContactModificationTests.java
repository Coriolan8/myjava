package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;


public class ContactModificationTests extends TestBase {


    @Test
    public void testContactModification() {
      app.getNavigationHelper().goHomePage();
      if (! app.getContactHelper().isThereAContact())
      {app.getContactHelper().createContact(new ContactData("Yulia", "Ve", "9(888)777-66-55", "prelest@gm.com", "test1"));}
      app.getContactHelper().selectContact();
      app.getContactHelper().startContactEdit();
      app.getContactHelper().fillContactForm(new ContactData("Yulia", "Very", null, "prelest@gm.com", "null"), false);
      app.getContactHelper().submitContactEdit();
      app.getNavigationHelper().goHomePage();
    }
}
