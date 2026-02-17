package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {


  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goHomePage();
    if (! app.getContactHelper().isThereAContact())
    {app.getContactHelper().createContact(new ContactData("Yulia", "Ve", "9(888)777-66-55", "prelest@gm.com", "test1"));}
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().goHomePage();
  }
}
