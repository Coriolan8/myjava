package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.time.Duration;

public class ApplicationManager {
  WebDriver wd;

  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private ContactHelper contactHelper;
  private Browser browser;

  public ApplicationManager(Browser browser) {
    this.browser = browser;
  }

  public void init() {
    if (browser == Browser.FIREFOX) {
        wd = new FirefoxDriver();
      } else if (browser == Browser.CHROME){
        wd = new ChromeDriver();}
        else if(browser == Browser.EDGE){
          wd = new EdgeDriver();
        }
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
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
