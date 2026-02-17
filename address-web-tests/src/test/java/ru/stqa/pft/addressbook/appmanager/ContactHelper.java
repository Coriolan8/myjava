package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {


  private static final Logger log = LoggerFactory.getLogger(ContactHelper.class);

  public ContactHelper(WebDriver wd) {
    super(wd);;
  }
  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"),contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("home"), contactData.getHomenumber());
    type(By.name("email"), contactData.getEmail());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.group());}
    else {
      Assert.assertFalse(isElemetPresent(By.name("new_group")));
    }
   }

  public void addNewContact() {
   click(By.linkText("add new"));
  }
  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteContact() {click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    acceptAlert();
  }
  public void startContactEdit() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactEdit() {
    click(By.name("update"));
  }

  public void acceptAlert() {
    wd.switchTo().alert().accept();
  }

}

