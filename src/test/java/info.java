import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class info extends SetUp {
    @Test
    public void Information() throws IOException, InterruptedException {
        driver.get("https://www.storerepublic.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'CONTACT')]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"))).sendKeys("Fardin Amin Arpon");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]"))).sendKeys("095050296");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"))).sendKeys("fardin@storerepublic.co@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]"))).sendKeys("200000/-");
        sleep(2000);
;
        driver.navigate().back();
    }
}
