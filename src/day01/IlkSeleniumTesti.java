package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\proje\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();git
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        //driver.close(); sadece calisan brozser kapatir
        driver.quit();// acik olan tum browser'leri kapatir


    }
}
