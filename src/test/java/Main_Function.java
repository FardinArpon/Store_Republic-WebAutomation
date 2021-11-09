import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class Main_Function extends SetUp{
    @Test
    public void mainFunction() throws IOException {
        driver.get("https://www.storerepublic.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) nav.navbar_mainNavbar__3dKF2.navbar.navbar-expand-md:nth-child(1) div.navbar_collapseParent__2jvt5.collapse.navbar-collapse ul.navbar-nav > li.nav-item:nth-child(1)"))).click();
        boolean Service = driver.findElement(By.xpath("//div[contains(text(),'Driving')]")).isDisplayed();
        Assert.assertEquals(Service, true);
        driver.navigate().back();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) nav.navbar_mainNavbar__3dKF2.navbar.navbar-expand-md:nth-child(1) div.navbar_collapseParent__2jvt5.collapse.navbar-collapse ul.navbar-nav > li.nav-item:nth-child(2)"))).click();
        boolean price = driver.findElement(By.xpath("//div[contains(text(),'Cheap')]")).isDisplayed();
        Assert.assertEquals(price, true);
        driver.navigate().back();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("nav.navbar_mainNavbar__3dKF2.navbar.navbar-expand-md:nth-child(1) div.navbar_collapseParent__2jvt5.collapse.navbar-collapse ul.navbar-nav li.nav-item:nth-child(3) > a.navbar_linkStyle__1ZemP.navbar_linkStyle__1ZemP"))).click();
        boolean About = driver.findElement(By.xpath("//div[contains(text(),'Passionate')]")).isDisplayed();
        Assert.assertEquals(About, true);
        driver.navigate().back();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__next']/nav[1]/div[3]/ul[2]/li[4]/a[1]"))).click();
        boolean Blog = driver.findElement(By.xpath("//div[contains(text(),'Tech')]")).isDisplayed();
        Assert.assertEquals(Blog, true);
        driver.navigate().back();driver.navigate().back();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'CONTACT')]"))).click();
        boolean Contact = driver.findElement(By.xpath("//div[contains(text(),\"We'd love to build something amazing together!\")]")).isDisplayed();
        Assert.assertEquals(Contact, true);
        driver.navigate().back();

    }
}
