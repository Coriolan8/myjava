package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import java.time.Duration;

public class ApplicationManager {
  FirefoxDriver wd;

  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private ContactHelper contactHelper;

    public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    SessionHelper sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() { navigationHelper.wd.quit();
  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
      }
  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
