package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/selenium/chomedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");
        Thread.sleep(5000);
        WebElement tamamButton = driver.findElement(By.cssSelector("#userKvkkModal > div > div.btnHolder > span"));
        tamamButton.click();
        Thread.sleep(5000);

        driver.get("https://www.n11.com/giris-yap");
        WebElement email = driver.findElement(By.cssSelector("div[class='inputField '] input[id='email']"));
        WebElement password = driver.findElement(By.cssSelector("div[class='inputField '] input[id='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("html body div#wrapper.simple.login div#contentWrapper div.container.container_1180 div#content.form.registerFormFieldset.loginPage div#loginContainer div.fieldset div.leftBlock div.blockWrap form#loginForm.well.form-horizontal div#loginButton.green_flat"));
        loginButton.click();
        email.sendKeys("vestra010@gmail.com");
        password.sendKeys("123n11");
        Thread.sleep(3000);
        loginButton.click();
        // Thread.sleep(5000);

        WebElement searchData = driver.findElement(By.cssSelector("#searchData"));
        email.sendKeys("samsung");
        WebElement button = driver.findElement(By.cssSelector("##header > div > div > div.hMedMenu > div.searchBox.withLocalization > a"));
        button.click();

        WebElement colomn = driver.findElement(By.cssSelector("#view > ul > li:nth-child(1)"));

        if (!colomn.equals("") ||colomn !=null){
            System.out.println("Ürün Bulunmaktadır.");
        }
       // driver.close();

    }
}
