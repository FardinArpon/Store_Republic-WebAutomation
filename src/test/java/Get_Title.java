import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Get_Title extends SetUp{
    @Test
    public void gettitel() throws IOException {
        driver.get("https://www.storerepublic.com/");
        wait = new WebDriverWait(driver, 10);
    }
}

