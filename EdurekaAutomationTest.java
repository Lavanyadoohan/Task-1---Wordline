//Lavanya Doohan - WDGET2024114
package Assessment.Assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EdurekaAutomationTest {
    @Test
    public void testEdurekaProfileUpdate() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();
        
        WebElement loginButton = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"));
        loginButton.click();
        driver.findElement(By.id("si_popup_email")).sendKeys("lavanya.doohan@gmail.com");
        driver.findElement(By.id("si_popup_passwd")).sendKeys("LisaE-12!*");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/button")).click();
        Thread.sleep(5000);
        
        driver.navigate().to("https://learning.edureka.co/my-profile");
        Thread.sleep(7000);
        
        WebElement personalEdit = driver.findElement(By.id("personal_details"));
        personalEdit.click();
        Thread.sleep(7000);
        driver.findElement(By.id("wzrk-cancel")).click();
        
        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.clear();
        fullName.sendKeys("Lavanya Doohan");
        
        WebElement experienceDropdown = driver.findElement(By.xpath("//ngx-select-dropdown[@id='experience']"));
        experienceDropdown.click();
        WebElement selectExperience = driver.findElement(By.xpath("//ul[@id='select-dropdown-options']/li[2]"));
        selectExperience.click();
        
        WebElement industryDropdown = driver.findElement(By.xpath("//ngx-select-dropdown[@id='industry']"));
        industryDropdown.click();
        WebElement selectIndustry = driver.findElement(By.xpath("//ul[@id='select-dropdown-options']/li[5]"));
        selectIndustry.click();
        
        WebElement designation = driver.findElement(By.id("designation"));
        designation.clear();
        designation.sendKeys("Software Tester");
        
        driver.findElement(By.xpath("//button[contains(text(),'Save Changes')]")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[contains(text(),'My Profile')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        Thread.sleep(5000);
        
        driver.navigate().to("https://www.edureka.co/blog/");
        driver.quit();
    }
}
